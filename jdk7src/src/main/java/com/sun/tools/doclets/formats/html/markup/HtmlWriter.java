/*
 * Copyright (c) 1997, 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.tools.doclets.formats.html.markup;

import java.io.*;

import com.sun.tools.doclets.internal.toolkit.*;
import com.sun.tools.doclets.internal.toolkit.util.*;

/**
 * Class for the Html format code generation.
 * Initializes PrintWriter with FileWriter, to enable print
 * related methods to generate the code to the named File through FileWriter.
 *
 * @since 1.2
 * @author Atul M Dambalkar
 * @author Bhavesh Patel (Modified)
 */
public class HtmlWriter {

    /**
     * Name of the file, to which this writer is writing to.
     */
    protected final String htmlFilename;

    /**
     * The window title of this file
     */
    protected String winTitle;

    /**
     * URL file separator string("/").
     */
    public static final String fileseparator =
         DirectoryManager.URL_FILE_SEPARATOR;

    /**
     * The configuration
     */
    protected Configuration configuration;

    /**
     * The flag to indicate whether a member details list is printed or not.
     */
    protected boolean memberDetailsListPrinted;

    /**
     * Header for tables displaying packages and description..
     */
    protected final String[] packageTableHeader;

    /**
     * Summary for use tables displaying class and package use.
     */
    protected final String useTableSummary;

    /**
     * Column header for class docs displaying Modifier and Type header.
     */
    protected final String modifierTypeHeader;

    public final Content overviewLabel;

    public final Content defaultPackageLabel;

    public final Content packageLabel;

    public final Content useLabel;

    public final Content prevLabel;

    public final Content nextLabel;

    public final Content prevclassLabel;

    public final Content nextclassLabel;

    public final Content summaryLabel;

    public final Content detailLabel;

    public final Content framesLabel;

    public final Content noframesLabel;

    public final Content treeLabel;

    public final Content classLabel;

    public final Content deprecatedLabel;

    public final Content deprecatedPhrase;

    public final Content allclassesLabel;

    public final Content indexLabel;

    public final Content helpLabel;

    public final Content seeLabel;

    public final Content descriptionLabel;

    public final Content prevpackageLabel;

    public final Content nextpackageLabel;

    public final Content packagesLabel;

    public final Content methodDetailsLabel;

    public final Content annotationTypeDetailsLabel;

    public final Content fieldDetailsLabel;

    public final Content propertyDetailsLabel;

    public final Content constructorDetailsLabel;

    public final Content enumConstantsDetailsLabel;

    public final Content specifiedByLabel;

    public final Content overridesLabel;

    public final Content descfrmClassLabel;

    public final Content descfrmInterfaceLabel;

    private final File file;

    private final String docEncoding;

    private Writer writer;

    /**
     * Constructor.
     *
     * @param path The directory path to be created for this file
     *             or null if none to be created.
     * @param filename File Name to which the PrintWriter will
     *                 do the Output.
     * @param docencoding Encoding to be used for this file.
     * @exception IOException Exception raised by the FileWriter is passed on
     * to next level.
     * @exception UnSupportedEncodingException Exception raised by the
     * OutputStreamWriter is passed on to next level.
     */
    public HtmlWriter(Configuration configuration,
                      String path, String filename, String docencoding)
                      throws IOException, UnsupportedEncodingException {
        file = Util.genWriterFile(configuration, path, filename);
        this.configuration = configuration;
        this.docEncoding = docencoding;
        htmlFilename = filename;
        this.memberDetailsListPrinted = false;
        packageTableHeader = new String[] {
            configuration.getText("doclet.Package"),
            configuration.getText("doclet.Description")
        };
        useTableSummary = configuration.getText("doclet.Use_Table_Summary",
                configuration.getText("doclet.packages"));
        modifierTypeHeader = configuration.getText("doclet.0_and_1",
                configuration.getText("doclet.Modifier"),
                configuration.getText("doclet.Type"));
        overviewLabel = getResource("doclet.Overview");
        defaultPackageLabel = new RawHtml(
                DocletConstants.DEFAULT_PACKAGE_NAME);
        packageLabel = getResource("doclet.Package");
        useLabel = getResource("doclet.navClassUse");
        prevLabel = getResource("doclet.Prev");
        nextLabel = getResource("doclet.Next");
        prevclassLabel = getResource("doclet.Prev_Class");
        nextclassLabel = getResource("doclet.Next_Class");
        summaryLabel = getResource("doclet.Summary");
        detailLabel = getResource("doclet.Detail");
        framesLabel = getResource("doclet.Frames");
        noframesLabel = getResource("doclet.No_Frames");
        treeLabel = getResource("doclet.Tree");
        classLabel = getResource("doclet.Class");
        deprecatedLabel = getResource("doclet.navDeprecated");
        deprecatedPhrase = getResource("doclet.Deprecated");
        allclassesLabel = getResource("doclet.All_Classes");
        indexLabel = getResource("doclet.Index");
        helpLabel = getResource("doclet.Help");
        seeLabel = getResource("doclet.See");
        descriptionLabel = getResource("doclet.Description");
        prevpackageLabel = getResource("doclet.Prev_Package");
        nextpackageLabel = getResource("doclet.Next_Package");
        packagesLabel = getResource("doclet.Packages");
        methodDetailsLabel = getResource("doclet.Method_Detail");
        annotationTypeDetailsLabel = getResource("doclet.Annotation_Type_Member_Detail");
        fieldDetailsLabel = getResource("doclet.Field_Detail");
        propertyDetailsLabel = getResource("doclet.Property_Detail");
        constructorDetailsLabel = getResource("doclet.Constructor_Detail");
        enumConstantsDetailsLabel = getResource("doclet.Enum_Constant_Detail");
        specifiedByLabel = getResource("doclet.Specified_By");
        overridesLabel = getResource("doclet.Overrides");
        descfrmClassLabel = getResource("doclet.Description_From_Class");
        descfrmInterfaceLabel = getResource("doclet.Description_From_Interface");
    }

    public void write(Content c) throws IOException {
        writer = Util.genWriter(file, docEncoding);
        c.write(writer, true);
    }

    public void close() throws IOException {
        writer.close();
    }

    /**
     * Get the configuration string as a content.
     *
     * @param key the key to look for in the configuration file
     * @return a content tree for the text
     */
    public Content getResource(String key) {
        return new StringContent(configuration.getText(key));
    }

    /**
     * Get the configuration string as a content.
     *
     * @param key the key to look for in the configuration file
     * @param a1 string argument added to configuration text
     * @return a content tree for the text
     */
    public Content getResource(String key, String a1) {
        return new RawHtml(configuration.getText(key, a1));
    }

    /**
     * Get the configuration string as a content.
     *
     * @param key the key to look for in the configuration file
     * @param a1 string argument added to configuration text
     * @param a2 string argument added to configuration text
     * @return a content tree for the text
     */
    public Content getResource(String key, String a1, String a2) {
        return new RawHtml(configuration.getText(key, a1, a2));
    }

    /**
     * Returns an HtmlTree for the SCRIPT tag.
     *
     * @return an HtmlTree for the SCRIPT tag
     */
    protected HtmlTree getWinTitleScript(){
        HtmlTree script = new HtmlTree(HtmlTag.SCRIPT);
        if(winTitle != null && winTitle.length() > 0) {
            script.addAttr(HtmlAttr.TYPE, "text/javascript");
            String scriptCode = "<!--" + DocletConstants.NL +
                    "    try {" + DocletConstants.NL +
                    "        if (location.href.indexOf('is-external=true') == -1) {" + DocletConstants.NL +
                    "            parent.document.title=\"" + escapeJavaScriptChars(winTitle) + "\";" + DocletConstants.NL +
                    "        }" + DocletConstants.NL +
                    "    }" + DocletConstants.NL +
                    "    catch(err) {" + DocletConstants.NL +
                    "    }" + DocletConstants.NL +
                    "//-->" + DocletConstants.NL;
            RawHtml scriptContent = new RawHtml(scriptCode);
            script.addContent(scriptContent);
        }
        return script;
    }

    /**
     * Returns a String with escaped special JavaScript characters.
     *
     * @param s String that needs to be escaped
     * @return a valid escaped JavaScript string
     */
    private static String escapeJavaScriptChars(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '\b':
                    sb.append("\\b");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
                case '"':
                    sb.append("\\\"");
                    break;
                case '\'':
                    sb.append("\\\'");
                    break;
                case '\\':
                    sb.append("\\\\");
                    break;
                default:
                    if (ch < 32 || ch >= 127) {
                        sb.append(String.format("\\u%04X", (int)ch));
                    } else {
                        sb.append(ch);
                    }
                    break;
            }
        }
        return sb.toString();
    }

    /**
     * Returns a content tree for the SCRIPT tag for the main page(index.html).
     *
     * @return a content for the SCRIPT tag
     */
    protected Content getFramesetJavaScript() {
        HtmlTree script = new HtmlTree(HtmlTag.SCRIPT);
        script.addAttr(HtmlAttr.TYPE, "text/javascript");
        String scriptCode = DocletConstants.NL +
                "    tmpTargetPage = \"\" + window.location.search;" + DocletConstants.NL +
                "    if (tmpTargetPage != \"\" && tmpTargetPage != \"undefined\")" + DocletConstants.NL +
                "        tmpTargetPage = tmpTargetPage.substring(1);" + DocletConstants.NL +
                "    if (tmpTargetPage.indexOf(\":\") != -1 || (tmpTargetPage != \"\" && !validURL(tmpTargetPage)))" + DocletConstants.NL +
                "        tmpTargetPage = \"undefined\";" + DocletConstants.NL +
                "    targetPage = tmpTargetPage;" + DocletConstants.NL +
                "    function validURL(url) {" + DocletConstants.NL +
                "        try {" + DocletConstants.NL +
                "            url = decodeURIComponent(url);" + DocletConstants.NL +
                "        }" + DocletConstants.NL +
                "        catch (error) {" + DocletConstants.NL +
                "            return false;" + DocletConstants.NL +
                "        }" + DocletConstants.NL +
                "        var pos = url.indexOf(\".html\");" + DocletConstants.NL +
                "        if (pos == -1 || pos != url.length - 5)" + DocletConstants.NL +
                "            return false;" + DocletConstants.NL +
                "        var allowNumber = false;" + DocletConstants.NL +
                "        var allowSep = false;" + DocletConstants.NL +
                "        var seenDot = false;" + DocletConstants.NL +
                "        for (var i = 0; i < url.length - 5; i++) {" + DocletConstants.NL +
                "            var ch = url.charAt(i);" + DocletConstants.NL +
                "            if ('a' <= ch && ch <= 'z' ||" + DocletConstants.NL +
                "                    'A' <= ch && ch <= 'Z' ||" + DocletConstants.NL +
                "                    ch == '$' ||" + DocletConstants.NL +
                "                    ch == '_' ||" + DocletConstants.NL +
                "                    ch.charCodeAt(0) > 127) {" + DocletConstants.NL +
                "                allowNumber = true;" + DocletConstants.NL +
                "                allowSep = true;" + DocletConstants.NL +
                "            } else if ('0' <= ch && ch <= '9'" + DocletConstants.NL +
                "                    || ch == '-') {" + DocletConstants.NL +
                "                if (!allowNumber)" + DocletConstants.NL +
                "                     return false;" + DocletConstants.NL +
                "            } else if (ch == '/' || ch == '.') {" + DocletConstants.NL +
                "                if (!allowSep)" + DocletConstants.NL +
                "                    return false;" + DocletConstants.NL +
                "                allowNumber = false;" + DocletConstants.NL +
                "                allowSep = false;" + DocletConstants.NL +
                "                if (ch == '.')" + DocletConstants.NL +
                "                     seenDot = true;" + DocletConstants.NL +
                "                if (ch == '/' && seenDot)" + DocletConstants.NL +
                "                     return false;" + DocletConstants.NL +
                "            } else {" + DocletConstants.NL +
                "                return false;"+ DocletConstants.NL +
                "            }" + DocletConstants.NL +
                "        }" + DocletConstants.NL +
                "        return true;" + DocletConstants.NL +
                "    }" + DocletConstants.NL +
                "    function loadFrames() {" + DocletConstants.NL +
                "        if (targetPage != \"\" && targetPage != \"undefined\")" + DocletConstants.NL +
                "             top.classFrame.location = top.targetPage;" + DocletConstants.NL +
                "    }" + DocletConstants.NL;
        RawHtml scriptContent = new RawHtml(scriptCode);
        script.addContent(scriptContent);
        return script;
    }

    /**
     * Returns an HtmlTree for the BODY tag.
     *
     * @param includeScript  set true if printing windowtitle script
     * @param title title for the window
     * @return an HtmlTree for the BODY tag
     */
    public HtmlTree getBody(boolean includeScript, String title) {
        HtmlTree body = new HtmlTree(HtmlTag.BODY);
        // Set window title string which is later printed
        this.winTitle = title;
        // Don't print windowtitle script for overview-frame, allclasses-frame
        // and package-frame
        if (includeScript) {
            body.addContent(getWinTitleScript());
            Content noScript = HtmlTree.NOSCRIPT(
                    HtmlTree.DIV(getResource("doclet.No_Script_Message")));
            body.addContent(noScript);
        }
        return body;
    }

    /**
     * Returns an HtmlTree for the TITLE tag.
     *
     * @return an HtmlTree for the TITLE tag
     */
    public HtmlTree getTitle() {
        HtmlTree title = HtmlTree.TITLE(new StringContent(winTitle));
        return title;
    }

    /**
     * Return, text passed, with Italics &lt;i&gt; and &lt;/i&gt; tags, surrounding it.
     * So if the text passed is "Hi", then string returned will be "&lt;i&gt;Hi&lt;/i&gt;".
     *
     * @param text String to be printed in between &lt;I&gt; and &lt;/I&gt; tags.
     */
    public String italicsText(String text) {
        return "<i>" + text + "</i>";
    }

    public String codeText(String text) {
        return "<code>" + text + "</code>";
    }

    /**
     * Return "&#38;nbsp;", non-breaking space.
     */
    public Content getSpace() {
        return RawHtml.nbsp;
    }

    /*
     * Returns a header for Modifier and Type column of a table.
     */
    public String getModifierTypeHeader() {
        return modifierTypeHeader;
    }
}
