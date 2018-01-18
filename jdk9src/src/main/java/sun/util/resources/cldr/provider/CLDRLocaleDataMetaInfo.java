/*
 * Copyright (c) 2012, 2016, Oracle and/or its affiliates. All rights reserved.
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

package sun.util.resources.cldr.provider;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import sun.util.locale.provider.LocaleProviderAdapter;
import sun.util.locale.provider.LocaleDataMetaInfo;

public class CLDRLocaleDataMetaInfo implements LocaleDataMetaInfo {
    private static final Map<String, String> resourceNameToLocales = new HashMap<>();

    static {

        resourceNameToLocales.put("CurrencyNames",
              " af af-NA agq ak am ar ar-DJ ar-ER ar-LB ar-SO ar-SS asa ast az az-Cyrl bas be bem bez bg bm bn bo bo-IN br brx bs bs-Cyrl ca ca-FR cgg chr cs cy da dav de de-CH de-LU dje dsb dyo dz ebu ee el en-001 en-AG en-AI en-AU en-BB en-BM en-BS en-BW en-BZ en-CA en-CC en-CK en-CX en-DM en-ER en-FJ en-FK en-GB en-GD en-GH en-GI en-GM en-GY en-JM en-KE en-KI en-KN en-KY en-LC en-LR en-LS en-MG en-MO en-MS en-MT en-MU en-MW en-MY en-NA en-NF en-NG en-NR en-NU en-NZ en-PG en-PH en-PK en-PN en-RW en-SB en-SC en-SG en-SH en-SL en-SS en-SX en-SZ en-TK en-TO en-TT en-TV en-TZ en-UG en-VC en-VU en-WS en-ZA en-ZM es es-419 es-AR es-BO es-CL es-CO es-CR es-CU es-DO es-EC es-GQ es-GT es-HN es-MX es-NI es-PA es-PE es-PH es-PR es-PY es-SV es-US es-UY es-VE et eu ewo fa fa-AF ff ff-GN ff-MR fi fil fo fr fr-BI fr-CA fr-CD fr-DJ fr-DZ fr-GN fr-HT fr-KM fr-LU fr-MG fr-MR fr-MU fr-RW fr-SC fr-SY fr-TN fr-VU fur fy ga gd gl gsw gu guz ha ha-Latn-GH haw he hi hr hr-BA hsb hu hy id ig ii is it ja jgo jmc ka kab kam kde kea khq ki kk kkj kl kln km kn ko ks ksb ksf ksh ky lag lb lg lkt ln ln-AO lo lt lu luo luy lv mas mas-TZ mer mfe mg mgh mgo mk ml mn mr ms ms-Latn-BN ms-Latn-SG mt mua my naq nb nd ne nl nl-AW nl-BQ nl-CW nl-SR nl-SX nmg nn nnh nyn om om-KE or os os-RU pa pa-Arab pl ps pt pt-AO pt-CV pt-MO pt-MZ pt-PT pt-ST qu qu-BO qu-EC rm rn ro ro-MD rof ru ru-BY ru-KG ru-KZ ru-MD rw rwk sah saq sbp se se-SE seh ses sg shi shi-Latn si sk sl smn sn so so-DJ so-ET so-KE sq sq-MK sr sr-Latn sv sw sw-CD sw-UG ta ta-LK ta-MY ta-SG te teo teo-KE th ti ti-ER to tr twq tzm ug uk ur ur-IN uz uz-Arab uz-Cyrl vai vai-Latn vi vun wae xog yav yi yo yo-BJ zgh zh zh-Hans-HK zh-Hans-MO zh-Hans-SG zh-Hant zh-Hant-HK zh-Hant-MO zu");
        resourceNameToLocales.put("AvailableLocales",
              " af af-NA af-ZA agq agq-CM ak ak-GH am am-ET ar ar-001 ar-AE ar-BH ar-DJ ar-DZ ar-EG ar-EH ar-ER ar-IL ar-IQ ar-JO ar-KM ar-KW ar-LB ar-LY ar-MA ar-MR ar-OM ar-PS ar-QA ar-SA ar-SD ar-SO ar-SS ar-SY ar-TD ar-TN ar-YE as as-IN asa asa-TZ ast ast-ES az az-Cyrl az-Cyrl-AZ az-Latn az-Latn-AZ bas bas-CM be be-BY bem bem-ZM bez bez-TZ bg bg-BG bm bm-Latn bm-Latn-ML bn bn-BD bn-IN bo bo-CN bo-IN br br-FR brx brx-IN bs bs-Cyrl bs-Cyrl-BA bs-Latn bs-Latn-BA ca ca-AD ca-ES ca-ES-VALENCIA ca-FR ca-IT cgg cgg-UG chr chr-US cs cs-CZ cy cy-GB da da-DK da-GL dav dav-KE de de-AT de-BE de-CH de-DE de-LI de-LU dje dje-NE dsb dsb-DE dua dua-CM dyo dyo-SN dz dz-BT ebu ebu-KE ee ee-GH ee-TG el el-CY el-GR en-001 en-150 en-AG en-AI en-AS en-AU en-BB en-BE en-BM en-BS en-BW en-BZ en-CA en-CC en-CK en-CM en-CX en-DG en-DM en-ER en-FJ en-FK en-FM en-GB en-GD en-GG en-GH en-GI en-GM en-GU en-GY en-HK en-IE en-IM en-IN en-IO en-JE en-JM en-KE en-KI en-KN en-KY en-LC en-LR en-LS en-MG en-MH en-MO en-MP en-MS en-MT en-MU en-MW en-MY en-NA en-NF en-NG en-NR en-NU en-NZ en-PG en-PH en-PK en-PN en-PR en-PW en-RW en-SB en-SC en-SD en-SG en-SH en-SL en-SS en-SX en-SZ en-TC en-TK en-TO en-TT en-TV en-TZ en-UG en-UM en-VC en-VG en-VI en-VU en-WS en-ZA en-ZM en-ZW eo eo-001 es es-419 es-AR es-BO es-CL es-CO es-CR es-CU es-DO es-EA es-EC es-ES es-GQ es-GT es-HN es-IC es-MX es-NI es-PA es-PE es-PH es-PR es-PY es-SV es-US es-UY es-VE et et-EE eu eu-ES ewo ewo-CM fa fa-AF fa-IR ff ff-CM ff-GN ff-MR ff-SN fi fi-FI fil fil-PH fo fo-FO fr fr-BE fr-BF fr-BI fr-BJ fr-BL fr-CA fr-CD fr-CF fr-CG fr-CH fr-CI fr-CM fr-DJ fr-DZ fr-FR fr-GA fr-GF fr-GN fr-GP fr-GQ fr-HT fr-KM fr-LU fr-MA fr-MC fr-MF fr-MG fr-ML fr-MQ fr-MR fr-MU fr-NC fr-NE fr-PF fr-PM fr-RE fr-RW fr-SC fr-SN fr-SY fr-TD fr-TG fr-TN fr-VU fr-WF fr-YT fur fur-IT fy fy-NL ga ga-IE gd gd-GB gl gl-ES gsw gsw-CH gsw-FR gsw-LI gu gu-IN guz guz-KE gv gv-IM ha ha-Latn ha-Latn-GH ha-Latn-NE ha-Latn-NG haw haw-US he he-IL hi hi-IN hr hr-BA hr-HR hsb hsb-DE hu hu-HU hy hy-AM id id-ID ig ig-NG ii ii-CN is is-IS it it-CH it-IT it-SM ja ja-JP jgo jgo-CM jmc jmc-TZ ka ka-GE kab kab-DZ kam kam-KE kde kde-TZ kea kea-CV khq khq-ML ki ki-KE kk kk-Cyrl kk-Cyrl-KZ kkj kkj-CM kl kl-GL kln kln-KE km km-KH kn kn-IN ko ko-KP ko-KR kok kok-IN ks ks-Arab ks-Arab-IN ksb ksb-TZ ksf ksf-CM ksh ksh-DE kw kw-GB ky ky-Cyrl ky-Cyrl-KG lag lag-TZ lb lb-LU lg lg-UG lkt lkt-US ln ln-AO ln-CD ln-CF ln-CG lo lo-LA lt lt-LT lu lu-CD luo luo-KE luy luy-KE lv lv-LV mas mas-KE mas-TZ mer mer-KE mfe mfe-MU mg mg-MG mgh mgh-MZ mgo mgo-CM mk mk-MK ml ml-IN mn mn-Cyrl mn-Cyrl-MN mr mr-IN ms ms-Latn ms-Latn-BN ms-Latn-MY ms-Latn-SG mt mt-MT mua mua-CM my my-MM naq naq-NA nb nb-NO nb-SJ nd nd-ZW ne ne-IN ne-NP nl nl-AW nl-BE nl-BQ nl-CW nl-NL nl-SR nl-SX nmg nmg-CM nn nn-NO nnh nnh-CM nus nus-SD nyn nyn-UG om om-ET om-KE or or-IN os os-GE os-RU pa pa-Arab pa-Arab-PK pa-Guru pa-Guru-IN pl pl-PL ps ps-AF pt pt-AO pt-BR pt-CV pt-GW pt-MO pt-MZ pt-PT pt-ST pt-TL qu qu-BO qu-EC qu-PE rm rm-CH rn rn-BI ro ro-MD ro-RO rof rof-TZ ru ru-BY ru-KG ru-KZ ru-MD ru-RU ru-UA rw rw-RW rwk rwk-TZ sah sah-RU saq saq-KE sbp sbp-TZ se se-FI se-NO se-SE seh seh-MZ ses ses-ML sg sg-CF shi shi-Latn shi-Latn-MA shi-Tfng shi-Tfng-MA si si-LK sk sk-SK sl sl-SI smn smn-FI sn sn-ZW so so-DJ so-ET so-KE so-SO sq sq-AL sq-MK sq-XK sr sr-Cyrl sr-Cyrl-BA sr-Cyrl-ME sr-Cyrl-RS sr-Cyrl-XK sr-Latn sr-Latn-BA sr-Latn-ME sr-Latn-RS sr-Latn-XK sv sv-AX sv-FI sv-SE sw sw-CD sw-KE sw-TZ sw-UG ta ta-IN ta-LK ta-MY ta-SG te te-IN teo teo-KE teo-UG th th-TH ti ti-ER ti-ET to to-TO tr tr-CY tr-TR twq twq-NE tzm tzm-Latn tzm-Latn-MA ug ug-Arab ug-Arab-CN uk uk-UA ur ur-IN ur-PK uz uz-Arab uz-Arab-AF uz-Cyrl uz-Cyrl-UZ uz-Latn uz-Latn-UZ vai vai-Latn vai-Latn-LR vai-Vaii vai-Vaii-LR vi vi-VN vun vun-TZ wae wae-CH xog xog-UG yav yav-CM yi yi-001 yo yo-BJ yo-NG zgh zgh-MA zh zh-Hans zh-Hans-CN zh-Hans-HK zh-Hans-MO zh-Hans-SG zh-Hant zh-Hant-HK zh-Hant-MO zh-Hant-TW zu zu-ZA");
        resourceNameToLocales.put("CalendarData",
              " af-NA af-ZA agq-CM ak-GH am-ET ar-AE ar-BH ar-DJ ar-DZ ar-EG ar-EH ar-ER ar-IL ar-IQ ar-JO ar-KM ar-KW ar-LB ar-LY ar-MA ar-MR ar-OM ar-PS ar-QA ar-SA ar-SD ar-SO ar-SS ar-SY ar-TD ar-TN ar-YE as-IN asa-TZ ast-ES az-Cyrl-AZ az-Latn-AZ bas-CM be-BY bem-ZM bez-TZ bg-BG bm-Latn-ML bn-BD bn-IN bo-CN bo-IN br-FR brx-IN bs-Cyrl-BA bs-Latn-BA ca-AD ca-ES ca-FR ca-IT cgg-UG chr-US cs-CZ cy-GB da-DK da-GL dav-KE de-AT de-BE de-CH de-DE de-LI de-LU dje-NE dsb-DE dua-CM dyo-SN dz-BT ebu-KE ee-GH ee-TG el-CY el-GR en-AG en-AI en-AS en-AU en-BB en-BE en-BM en-BS en-BW en-BZ en-CA en-CC en-CK en-CM en-CX en-DG en-DM en-ER en-FJ en-FK en-FM en-GB en-GD en-GG en-GH en-GI en-GM en-GU en-GY en-HK en-IE en-IM en-IN en-IO en-JE en-JM en-KE en-KI en-KN en-KY en-LC en-LR en-LS en-MG en-MH en-MO en-MP en-MS en-MT en-MU en-MW en-MY en-NA en-NF en-NG en-NR en-NU en-NZ en-PG en-PH en-PK en-PN en-PR en-PW en-RW en-SB en-SC en-SD en-SG en-SH en-SL en-SS en-SX en-SZ en-TC en-TK en-TO en-TT en-TV en-TZ en-UG en-UM en-VC en-VG en-VI en-VU en-WS en-ZA en-ZM en-ZW es-AR es-BO es-CL es-CO es-CR es-CU es-DO es-EA es-EC es-ES es-GQ es-GT es-HN es-IC es-MX es-NI es-PA es-PE es-PH es-PR es-PY es-SV es-US es-UY es-VE et-EE eu-ES ewo-CM fa-AF fa-IR ff-CM ff-GN ff-MR ff-SN fi-FI fil-PH fo-FO fr-BE fr-BF fr-BI fr-BJ fr-BL fr-CA fr-CD fr-CF fr-CG fr-CH fr-CI fr-CM fr-DJ fr-DZ fr-FR fr-GA fr-GF fr-GN fr-GP fr-GQ fr-HT fr-KM fr-LU fr-MA fr-MC fr-MF fr-MG fr-ML fr-MQ fr-MR fr-MU fr-NC fr-NE fr-PF fr-PM fr-RE fr-RW fr-SC fr-SN fr-SY fr-TD fr-TG fr-TN fr-VU fr-WF fr-YT fur-IT fy-NL ga-IE gd-GB gl-ES gsw-CH gsw-FR gsw-LI gu-IN guz-KE gv-IM ha-Latn-GH ha-Latn-NE ha-Latn-NG haw-US he-IL hi-IN hr-BA hr-HR hsb-DE hu-HU hy-AM id-ID ig-NG ii-CN is-IS it-CH it-IT it-SM ja-JP jgo-CM jmc-TZ ka-GE kab-DZ kam-KE kde-TZ kea-CV khq-ML ki-KE kk-Cyrl-KZ kkj-CM kl-GL kln-KE km-KH kn-IN ko-KP ko-KR kok-IN ks-Arab-IN ksb-TZ ksf-CM ksh-DE kw-GB ky-Cyrl-KG lag-TZ lb-LU lg-UG lkt-US ln-AO ln-CD ln-CF ln-CG lo-LA lt-LT lu-CD luo-KE luy-KE lv-LV mas-KE mas-TZ mer-KE mfe-MU mg-MG mgh-MZ mgo-CM mk-MK ml-IN mn-Cyrl-MN mr-IN ms-Latn-BN ms-Latn-MY ms-Latn-SG mt-MT mua-CM my-MM naq-NA nb-NO nb-SJ nd-ZW ne-IN ne-NP nl-AW nl-BE nl-BQ nl-CW nl-NL nl-SR nl-SX nmg-CM nnh-CM nus-SD nyn-UG om-ET om-KE or-IN os-GE os-RU pa-Arab-PK pa-Guru-IN pl-PL ps-AF pt-AO pt-BR pt-CV pt-GW pt-MO pt-MZ pt-PT pt-ST pt-TL qu-BO qu-EC qu-PE rm-CH rn-BI ro-MD ro-RO rof-TZ ru-BY ru-KG ru-KZ ru-MD ru-RU ru-UA rw-RW rwk-TZ sah-RU saq-KE sbp-TZ se-FI se-NO se-SE seh-MZ ses-ML sg-CF shi-Latn-MA shi-Tfng-MA si-LK sk-SK sl-SI smn-FI sn-ZW so-DJ so-ET so-KE so-SO sq-AL sq-MK sq-XK sr-Cyrl-BA sr-Cyrl-ME sr-Cyrl-RS sr-Cyrl-XK sr-Latn-BA sr-Latn-ME sr-Latn-RS sr-Latn-XK sv-AX sv-FI sv-SE sw-CD sw-KE sw-TZ sw-UG ta-IN ta-LK ta-MY ta-SG te-IN teo-KE teo-UG th-TH ti-ER ti-ET to-TO tr-CY tr-TR twq-NE tzm-Latn-MA ug-Arab-CN uk-UA ur-IN ur-PK uz-Arab-AF uz-Cyrl-UZ uz-Latn-UZ vai-Latn-LR vai-Vaii-LR vi-VN vun-TZ wae-CH xog-UG yav-CM yo-BJ yo-NG zgh-MA zh-Hans-CN zh-Hans-HK zh-Hans-MO zh-Hans-SG zh-Hant-HK zh-Hant-TW zu-ZA");
        resourceNameToLocales.put("FormatData",
              " af af-NA af-ZA agq agq-CM ak ak-GH am am-ET ar ar-001 ar-AE ar-BH ar-DJ ar-DZ ar-EG ar-EH ar-ER ar-IL ar-IQ ar-JO ar-KM ar-KW ar-LB ar-LY ar-MA ar-MR ar-OM ar-PS ar-QA ar-SA ar-SD ar-SO ar-SS ar-SY ar-TD ar-TN ar-YE as as-IN asa asa-TZ ast ast-ES az az-Cyrl az-Cyrl-AZ az-Latn az-Latn-AZ bas bas-CM be be-BY bem bem-ZM bez bez-TZ bg bg-BG bm bm-Latn bm-Latn-ML bn bn-BD bn-IN bo bo-CN bo-IN br br-FR brx brx-IN bs bs-Cyrl bs-Cyrl-BA bs-Latn bs-Latn-BA ca ca-AD ca-ES ca-ES-VALENCIA ca-FR ca-IT cgg cgg-UG chr chr-US cs cs-CZ cy cy-GB da da-DK da-GL dav dav-KE de de-AT de-BE de-CH de-DE de-LI de-LU dje dje-NE dsb dsb-DE dua dua-CM dyo dyo-SN dz dz-BT ebu ebu-KE ee ee-GH ee-TG el el-CY el-GR en-001 en-150 en-AG en-AI en-AS en-AU en-BB en-BE en-BM en-BS en-BW en-BZ en-CA en-CC en-CK en-CM en-CX en-DG en-DM en-ER en-FJ en-FK en-FM en-GB en-GD en-GG en-GH en-GI en-GM en-GU en-GY en-HK en-IE en-IM en-IN en-IO en-JE en-JM en-KE en-KI en-KN en-KY en-LC en-LR en-LS en-MG en-MH en-MO en-MP en-MS en-MT en-MU en-MW en-MY en-NA en-NF en-NG en-NR en-NU en-NZ en-PG en-PH en-PK en-PN en-PR en-PW en-RW en-SB en-SC en-SD en-SG en-SH en-SL en-SS en-SX en-SZ en-TC en-TK en-TO en-TT en-TV en-TZ en-UG en-UM en-VC en-VG en-VI en-VU en-WS en-ZA en-ZM en-ZW eo eo-001 es es-419 es-AR es-BO es-CL es-CO es-CR es-CU es-DO es-EA es-EC es-ES es-GQ es-GT es-HN es-IC es-MX es-NI es-PA es-PE es-PH es-PR es-PY es-SV es-US es-UY es-VE et et-EE eu eu-ES ewo ewo-CM fa fa-AF fa-IR ff ff-CM ff-GN ff-MR ff-SN fi fi-FI fil fil-PH fo fo-FO fr fr-BE fr-BF fr-BI fr-BJ fr-BL fr-CA fr-CD fr-CF fr-CG fr-CH fr-CI fr-CM fr-DJ fr-DZ fr-FR fr-GA fr-GF fr-GN fr-GP fr-GQ fr-HT fr-KM fr-LU fr-MA fr-MC fr-MF fr-MG fr-ML fr-MQ fr-MR fr-MU fr-NC fr-NE fr-PF fr-PM fr-RE fr-RW fr-SC fr-SN fr-SY fr-TD fr-TG fr-TN fr-VU fr-WF fr-YT fur fur-IT fy fy-NL ga ga-IE gd gd-GB gl gl-ES gsw gsw-CH gsw-FR gsw-LI gu gu-IN guz guz-KE gv gv-IM ha ha-Latn ha-Latn-GH ha-Latn-NE ha-Latn-NG haw haw-US he he-IL hi hi-IN hr hr-BA hr-HR hsb hsb-DE hu hu-HU hy hy-AM id id-ID ig ig-NG ii ii-CN is is-IS it it-CH it-IT it-SM ja ja-JP jgo jgo-CM jmc jmc-TZ ka ka-GE kab kab-DZ kam kam-KE kde kde-TZ kea kea-CV khq khq-ML ki ki-KE kk kk-Cyrl kk-Cyrl-KZ kkj kkj-CM kl kl-GL kln kln-KE km km-KH kn kn-IN ko ko-KP ko-KR kok kok-IN ks ks-Arab ks-Arab-IN ksb ksb-TZ ksf ksf-CM ksh ksh-DE kw kw-GB ky ky-Cyrl ky-Cyrl-KG lag lag-TZ lb lb-LU lg lg-UG lkt lkt-US ln ln-AO ln-CD ln-CF ln-CG lo lo-LA lt lt-LT lu lu-CD luo luo-KE luy luy-KE lv lv-LV mas mas-KE mas-TZ mer mer-KE mfe mfe-MU mg mg-MG mgh mgh-MZ mgo mgo-CM mk mk-MK ml ml-IN mn mn-Cyrl mn-Cyrl-MN mr mr-IN ms ms-Latn ms-Latn-BN ms-Latn-MY ms-Latn-SG mt mt-MT mua mua-CM my my-MM naq naq-NA nb nb-NO nb-SJ nd nd-ZW ne ne-IN ne-NP nl nl-AW nl-BE nl-BQ nl-CW nl-NL nl-SR nl-SX nmg nmg-CM nn nn-NO nnh nnh-CM nus nus-SD nyn nyn-UG om om-ET om-KE or or-IN os os-GE os-RU pa pa-Arab pa-Arab-PK pa-Guru pa-Guru-IN pl pl-PL ps ps-AF pt pt-AO pt-BR pt-CV pt-GW pt-MO pt-MZ pt-PT pt-ST pt-TL qu qu-BO qu-EC qu-PE rm rm-CH rn rn-BI ro ro-MD ro-RO rof rof-TZ ru ru-BY ru-KG ru-KZ ru-MD ru-RU ru-UA rw rw-RW rwk rwk-TZ sah sah-RU saq saq-KE sbp sbp-TZ se se-FI se-NO se-SE seh seh-MZ ses ses-ML sg sg-CF shi shi-Latn shi-Latn-MA shi-Tfng shi-Tfng-MA si si-LK sk sk-SK sl sl-SI smn smn-FI sn sn-ZW so so-DJ so-ET so-KE so-SO sq sq-AL sq-MK sq-XK sr sr-Cyrl sr-Cyrl-BA sr-Cyrl-ME sr-Cyrl-RS sr-Cyrl-XK sr-Latn sr-Latn-BA sr-Latn-ME sr-Latn-RS sr-Latn-XK sv sv-AX sv-FI sv-SE sw sw-CD sw-KE sw-TZ sw-UG ta ta-IN ta-LK ta-MY ta-SG te te-IN teo teo-KE teo-UG th th-TH ti ti-ER ti-ET to to-TO tr tr-CY tr-TR twq twq-NE tzm tzm-Latn tzm-Latn-MA ug ug-Arab ug-Arab-CN uk uk-UA ur ur-IN ur-PK uz uz-Arab uz-Arab-AF uz-Cyrl uz-Cyrl-UZ uz-Latn uz-Latn-UZ vai vai-Latn vai-Latn-LR vai-Vaii vai-Vaii-LR vi vi-VN vun vun-TZ wae wae-CH xog xog-UG yav yav-CM yi yi-001 yo yo-BJ yo-NG zgh zgh-MA zh zh-Hans zh-Hans-CN zh-Hans-HK zh-Hans-MO zh-Hans-SG zh-Hant zh-Hant-HK zh-Hant-MO zh-Hant-TW zu zu-ZA");
        resourceNameToLocales.put("LocaleNames",
              " af agq ak am ar ar-EG as asa ast az az-Cyrl bas be bem bez bg bm bn bo bo-IN br brx bs bs-Cyrl ca cgg chr cs cy da dav de de-CH dje dsb dua dyo dz ebu ee el en-AU eo es es-CL es-MX et eu ewo fa fa-AF ff fi fil fo fr fr-CA fur fy ga gd gl gsw gu guz gv ha haw he hi hr hsb hu hy id ig ii is it ja jgo jmc ka kab kam kde kea khq ki kk kkj kl kln km kn ko kok ks ksb ksf ksh kw ky lag lb lg lkt ln lo lt lu luo luy lv mas mer mfe mg mgh mgo mk ml mn mr ms mt mua my naq nb nd ne nl nmg nn nnh nus nyn om or os pa pa-Arab pl ps pt pt-PT qu rm rn ro rof ru rw rwk sah saq sbp se se-FI seh ses sg shi shi-Latn si sk sl smn sn so sq sr sr-Latn sv sv-FI sw sw-CD ta te teo th ti to tr twq tzm ug uk ur ur-IN uz uz-Arab uz-Cyrl vai vai-Latn vi vun wae xog yav yi yo yo-BJ zgh zh zh-Hant zh-Hant-HK zu");
        resourceNameToLocales.put("TimeZoneNames",
              " af am ar as ast az be bg bn br brx bs bs-Cyrl ca chr cs cy da de dsb dz ee el en-001 en-AU en-BW en-CA en-CM en-ER en-GB en-GH en-GM en-GU en-HK en-IE en-IN en-KE en-LR en-LS en-MG en-MH en-MO en-MP en-MU en-MW en-MY en-NA en-NG en-NZ en-RW en-SD en-SG en-SL en-SS en-SZ en-TZ en-UG en-ZA en-ZM en-ZW es es-419 es-AR es-MX es-US et eu fa fi fil fr fr-CA fur fy ga gd gl gsw gu haw he hi hr hsb hu hy id is it ja ka kea kk km kn ko ko-KP kok ks ksh ky lb lo lt lv mk ml mn mr ms mt my nb ne ne-IN nl nn or os pa pl ps pt pt-AO pt-CV pt-GW pt-MO pt-MZ pt-PT pt-ST pt-TL ro ru se si sk sl sq sr sr-Latn sv sw ta ta-MY ta-SG te th to tr ug uk ur ur-IN uz uz-Cyrl vi wae zh zh-Hans-SG zh-Hant zh-Hant-HK zu");
    }


    @Override
    public LocaleProviderAdapter.Type getType() {
        return LocaleProviderAdapter.Type.CLDR;
    }


    @Override
    public String availableLanguageTags(String category) {
        return resourceNameToLocales.getOrDefault(category, "");
    }


}