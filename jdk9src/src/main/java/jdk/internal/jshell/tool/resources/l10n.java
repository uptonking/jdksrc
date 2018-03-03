package jdk.internal.jshell.tool.resources;

public final class l10n extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "help.bang", "Reevaluate the most recently entered snippet." },
            { "help.bang.args", "" },
            { "help.bang.summary", "re-run last snippet" },
            { "help.classes", "List the current active jshell classes, interfaces, and enums." },
            { "help.classes.args", "" },
            { "help.classes.summary", "list the declared classes" },
            { "help.classpath", "Append a additional path to the classpath." },
            { "help.classpath.args", "<path>" },
            { "help.classpath.summary", "add a path to the classpath" },
            { "help.debug", "Display debugging information for the jshell implementation.\n0: Debugging off\nr: Tool level debugging on\ng: General debugging on\nf: File manager debugging on\nc: Completion analysis debugging on\nd: Dependency debugging on\ne: Event debugging on" },
            { "help.debug.args", "[0][r][g][f][c][d][e]" },
            { "help.debug.summary", "toggle debugging of the jshell" },
            { "help.drop", "Drop a snippet -- making it inactive.\n\n/drop <name>\n\tDrop the snippet with the specified name\n\n/drop <id>\n\tDrop the snippet with the specified snippet id" },
            { "help.drop.args", "<name or id>" },
            { "help.drop.summary", "delete a source entry referenced by name or id" },
            { "help.edit", "Edit a snippet or snippets of source in an external editor.\nThe editor to use is set with /set editor.\nIf no editor has been set, a simple editor will be launched.\n\n/edit <name>\n\tEdit the snippet or snippets with the specified name (preference for active snippets)\n\n/edit <id>\n\tEdit the snippet with the specified snippet id\n\n/edit\n\tEdit the currently active snippets of code that you typed or read with /open" },
            { "help.edit.args", "<name or id>" },
            { "help.edit.summary", "edit a source entry referenced by name or id" },
            { "help.exit", "Leave the jshell tool.  No work is saved.\nSave any work before using this command" },
            { "help.exit.args", "" },
            { "help.exit.summary", "exit jshell" },
            { "help.help", "Display information about jshell.\n/help\n\tList the jshell commands and help subjects.\n\n/help <command>\n\tDisplay information about the specified comand. The slash must be included.\n\tOnly the first few letters of the command are needed -- if more than one\n\teach will be displayed.  Example:  /help /li\n\n/help <subject>\n\tDisplay information about the specified help subject. Example: /help intro" },
            { "help.help.args", "[<command>|<subject>]" },
            { "help.help.summary", "get information about jshell" },
            { "help.history", "Display the history of snippet and command input since this jshell was launched." },
            { "help.history.args", "" },
            { "help.history.summary", "history of what you have typed" },
            { "help.id", "Reevaluate the snippet specified by the id." },
            { "help.id.args", "" },
            { "help.id.summary", "re-run snippet by id" },
            { "help.imports", "List the current active jshell imports." },
            { "help.imports.args", "" },
            { "help.imports.summary", "list the imported items" },
            { "help.intro", "The jshell tool allows you to execute Java code, getting immediate results.\nYou can enter a Java definition (variable, method, class, etc), like:  int x = 8\nor a Java expression, like:  x + x\nor a Java statement or import.\nThese little chunks of Java code are called 'snippets'.\n\nThere are also jshell commands that allow you to understand and\ncontrol what you are doing, like:  /list\n\nFor a list of commands: /help" },
            { "help.intro.summary", "an introduction to the jshell tool" },
            { "help.list", "Show the source of snippets, prefaced with the snippet id.\n\n/list\n\tList the currently active snippets of code that you typed or read with /open\n\n/list start\n\tList the automatically evaluated start-up snippets\n\n/list all\n\tList all snippets including failed, overwritten, dropped, and start-up\n\n/list <name>\n\tList snippets with the specified name (preference for active snippets)\n\n/list <id>\n\tList the snippet with the specified snippet id" },
            { "help.list.args", "[all|start|<name or id>]" },
            { "help.list.summary", "list the source you have typed" },
            { "help.methods", "List the name, parameter types, and return type of the current active jshell methods." },
            { "help.methods.args", "" },
            { "help.methods.summary", "list the declared methods and their signatures" },
            { "help.open", "Open a file and read its contents as snippets and commands.\n\n/open <file>\n\tRead the specified file as jshell input." },
            { "help.open.args", "<file>" },
            { "help.open.summary", "open a file as source input" },
            { "help.previous", "Reevaluate the n-th most recently entered snippet." },
            { "help.previous.args", "" },
            { "help.previous.summary", "re-run n-th previous snippet" },
            { "help.quest", "Display information about jshell (abbreviation for /help).\n/?\n\tDisplay list of commands and help subjects.\n/? <command>\n\tDisplay information about the specified comand. The slash must be included.\n\tOnly the first few letters of the command are needed -- if more than one\n\tmatch, each will be displayed.  Example:  /? /li\n/? <subject>\n\tDisplay information about the specified help subject. Example: /? intro" },
            { "help.quest.args", "[<command>|<subject>]" },
            { "help.quest.summary", "get information about jshell" },
            { "help.reload", "Reset the jshell tool code and execution state then replay each\njshell valid command and valid snippet in the order they were entered.\n\n/reload\n\tReset and replay the valid history since jshell was entered, or\n\ta /reset, or /reload command was executed -- whichever is most\n\trecent.\n\n/reload restore\n\tReset and replay the valid history between the previous and most\n\trecent time that jshell was entered, or a /reset, or /reload\n\tcommand was executed. This can thus be used to restore a previous\n\tjshell tool sesson.\n\n/reload [restore] quiet\n\tWith the 'quiet' argument the replay is not shown.  Errors will display." },
            { "help.reload.args", "[restore] [quiet]" },
            { "help.reload.summary", "reset and replay relevant history -- current or previous (restore)" },
            { "help.reset", "Reset the jshell tool code and execution state:\n\t* All entered code is lost.\n\t* Start-up code is re-executed.\n\t* The execution state is restarted.\n\t* The classpath is cleared.\nTool settings are maintained, as set with: /set ...\nSave any work before using this command" },
            { "help.reset.args", "" },
            { "help.reset.summary", "reset jshell" },
            { "help.save", "Save the specified snippets and/or commands to the specified file.\n\n/save <file>\n\tSave the source of current active snippets to the file.\n\n/save all <file>\n\tSave the source of all snippets to the file.\n\tIncludes source including overwritten, failed, and start-up code.\n\n/save history <file>\n\tSave the sequential history of all commands and snippets entered since jshell was launched.\n\n/save start <file>\n\tSave the default start-up definitions to the file." },
            { "help.save.args", "[all|history|start] <file>" },
            { "help.save.summary", "Save snippet source to a file." },
            { "help.set", "Set jshell configuration information, including:\nthe external editor to use, the start-up definitions to use, a new feedback mode,\nthe command prompt, the feedback mode to use, or the format of output.\n\n/set editor <command> <optional-arg>...\n\tSpecify the command to launch for the /edit command.\n\tThe <command> is an operating system dependent string.\n\n/set start <file>\n\tThe contents of the specified <file> become the default start-up snippets and commands.\n\n/set feedback <mode>\n\tSet the feedback mode describing displayed feedback for entered snippets and commands.\n\n/set newmode <new-mode> [command|quiet [<old-mode>]]\n\tCreate a user-defined feedback mode, optionally copying from an existing mode.\n\n/set prompt <mode> \"<prompt>\" \"<continuation-prompt>\"\n\tSet the displayed prompts for a given feedback mode.\n\n/set format <mode> <field> \"<format>\" <selector>...\n\tConfigure a feedback mode by setting the format of a field when the selector matchs.\n\nTo get more information about one of these forms, use /help with the form specified.\nFor example:   /help /set format" },
            { "help.set.args", "editor|start|feedback|newmode|prompt|format ..." },
            { "help.set.editor", "Specify the command to launch for the /edit command.\n\n\t/set editor <command> <optional-arg>...\n\nThe <command> is an operating system dependent string.\nThe <command> may include space-separated arguments (such as flags) -- <optional-arg>....\nWhen /edit is used, the temporary file to edit will be appended as the last argument." },
            { "help.set.feedback", "Set the feedback mode describing displayed feedback for entered snippets and commands.\n\n\t/set feedback <mode>\n\nWhere <mode> is the name of a previously defined feedback mode.\nYou may use just enough letters to make it unique.\nUser-defined modes can be added, see '/help /set newmode'\nCurrently defined feedback modes:\n" },
            { "help.set.format", "Set the format for reporting a snippet event.\n\n\t/set format <mode> <field> \"<format>\" <selector>...\n\nWhere <mode> is the name of a previously defined feedback mode -- see '/help /set newmode'.\nWhere <field> is the name of context-specific format to define.\nWhere <format> is a quoted string which will be the value of the field if one of\nthe selectors matches (or there are no selectors). When the format is used,\nfield names enclosed in braces are replaced with the value of the field at that\ntime. These fields may have been previously defined with this command or may be\none of these predefined fields specific to the context:\n\t{name}       == The name, e.g.: the variable name, ...\n\t{type}       == The type name. The type of a variable or expression, the\n\t\t\tparameter types of a method\n\t{value}      == The result value of an expression or variable initialization\n\t{unresolved} == The list of unresolved references\n\t{errors}     == The list of recoverable errors (during the processing of the\n\t\t\t\"display\" field only)\n\t{err}        == An unformatted error line (during the processing of the\n\t\t\t\"errorline\" field only)\nThe following fields are accessed by the tool to determine the displayed feedback:\n\t{display}    == The displayed message for a snippet event\n\t{errorline}  == The format of one error line within the \"errors\" field\n\t{pre}        == The feedback prefix (begins command feedback)\n\t{post}       == The feedback postfix (ends command feedback)\n\t{errorpre}   == The error prefix (begins error feedback)\n\t{errorpost}  == The error postfix (ends error feedback)\nThese fields have default settings (which may be overwritten).\nWhere <selector> is the context in which the format is applied.\nThe structure of selector is a hyphen separated list of selector kind lists.\nA selector kind list is a comma separated list of values of one selector kind.\nA selector matches if each selector kind list matches; A selector kind list\nmatches if one of the values matches.\n\nThe case selector kind describes the kind of snippet.  The values are:\n\timport     -- import declaration\n\tclass      -- class declaration\n\tinterface  -- interface declaration\n\tenum       -- enum declaration\n\tannotation -- annotation interface declaration\n\tmethod     -- method declaration -- note: {type}==parameter-types\n\tvardecl    -- variable declaration without init\n\tvarinit    -- variable declaration with init\n\texpression -- expression -- note: {name}==scratch-variable-name\n\tvarvalue   -- variable value expression\n\tassignment -- assign variable\n\tstatement  -- statement\nThe action selector kind describes what happened to the snippet.  The values are:\n\tadded     -- snippet has been added\n\tmodified  -- an existing snippet has been modified\n\treplaced  -- an existing snippet has been replaced with a new snippet\n\toverwrote -- an existing snippet has been overwritten\n\tdropped   -- snippet has been dropped\n\tused      -- snippet was used when it cannot be\nThe when-did-it-occur selector kind describes if this is a direct or indirect action.  The values are:\n\tprimary -- the entered snippet\n\tupdate  -- an update to a dependent snippet\nThe resolution-state selector kind describes the state of resolution/definition of the snippet.  The values are:\n\tok         -- resolved correctly\n\tdefined    -- defined despite recoverably unresolved references\n\tnotdefined -- not defined because of recoverably unresolved references\nThe unresolved-count selector kind describes the number of unresolved references.  The values are:\n\tunresolved0 -- no names are unresolved\n\tunresolved1 -- one name is unresolved\n\tunresolved2 -- two or more names are unresolved\nThe errors-count selector kind describes the number of errors.  The values are:\n\terror0 -- no errors\n\terror1 -- one error\n\terror2 -- two or more errors\n\nExamples:\n\t/set format myformat action 'Created' added-primary\n\t/set format myformat action 'Update replaced' replaced-update\n\t/set format myformat display '{pre}{action} class {name}{post}' class-ok\n\t/set format myformat display '{pre}{action} variable {name}, reset to null{post}' replaced-vardecl,varinit-ok-update\n\nNote that subsequent selectors for a field may overwrite some or all of previous used selectors -- last one wins\n" },
            { "help.set.newmode", "Create a user-defined feedback mode, optionally copying from an existing mode.\n\n\t/set newmode <new-mode> [command|quiet [<old-mode>]]\n\nWhere <new-mode> is the name of a mode you wish to create.\nWhere <old-mode> is the name of a previously defined feedback mode.\nIf <old-mode> is present, its settings are copied to the new mode.\n'command' vs 'quiet' determines if informative/verifying command feedback is displayed.\n\nOnce the new mode is created, use '/set format' and '/set prompt' to configure it.\nUse '/set feedback' to use the new mode.\n" },
            { "help.set.prompt", "Set the prompts.  Both the normal prompt and the continuation-prompt must be set.\n\n\t/set prompt <mode> \"<prompt>\" \"<continuation-prompt>\"\n\nWhere <mode> is the name of a previously defined feedback mode.\nWhere <prompt> and <continuation-prompt> are quoted strings printed as input prompts;\nBoth may optionally contain '%s' which will be substituted with the next snippet id --\nnote that what is entered may not be assigned that id, for example it may be an error or command.\nThe continuation-prompt is used on the second and subsequent lines of a multi-line snippet.\n" },
            { "help.set.start", "Set the start-up configuration -- a sequence of snippets and commands read at start-up.\n\n\t/set start <file>\n\nThe contents of the specified <file> become the default start-up snippets and commands --\nwhich are run when the jshell tool is started or reset." },
            { "help.set.summary", "set jshell configuration information" },
            { "help.shortcuts", "Supported shortcuts include:\n\n<tab>\n\t\tAfter entering the first few letters of a Java identifier,\n\t\ta jshell command, or, in some cases, a jshell command argument,\n\t\tpress the <tab> key to complete the input.\n\t\tIf there is more than one completion, show possible completions.\n\nShift-<tab>\n\t\tAfter the name and open parenthesis of a method or constructor invocation,\n\t\thold the <shift> key and press the <tab> to see a synopsis of all\n\t\tmatching methods/constructors.\n\n<fix-shortcut> v\n\t\tAfter a complete expression, press \"<fix-shortcut> v\" to introduce a new variable\n\t\twhose type is based on the type of the expression.\n\t\tThe \"<fix-shortcut>\" is either Alt-F1 or Alt-Enter, depending on the platform.\n\n<fix-shortcut> i\n\t\tAfter an unresolvable identifier, press \"<fix-shortcut> i\" and jshell will propose\n\t\tpossible fully qualified names based on the content of the specified classpath.\n\t\tThe \"<fix-shortcut>\" is either Alt-F1 or Alt-Enter, depending on the platform." },
            { "help.shortcuts.summary", "a description of shortcuts" },
            { "help.usage", "Usage:   jshell <options> <load files>\nwhere possible options include:\n\t-classpath <path>          Specify where to find user class files\n\t-cp <path>                 Specify where to find user class files\n\t-startup <file>            One run replacement for the start-up definitions\n\t-nostartup                 Do not run the start-up definitions\n\t-help                      Print a synopsis of standard options\n\t-version                   Version information\n" },
            { "help.vars", "List the type, name, and value of the current active jshell variables." },
            { "help.vars.args", "" },
            { "help.vars.summary", "list the declared variables and their values" },
            { "jshell.console.choice", "Choice: " },
            { "jshell.console.create.variable", "Create variable" },
            { "jshell.console.do.nothing", "Do nothing" },
            { "jshell.console.incomplete", "\nResults may be incomplete; try again later for complete results." },
            { "jshell.console.no.candidate", "\nNo candidate fully qualified names found to import." },
            { "jshell.console.resolvable", "\nThe identifier is resolvable in this context." },
            { "jshell.console.see.more", "<press tab to see more>" },
            { "jshell.err.arg", "Invalid ''{0}'' argument: {1}" },
            { "jshell.err.cant.launch.editor", "Cannot launch editor -- unexpected exception: {0}" },
            { "jshell.err.classpath.arg", "The /classpath command requires a path argument." },
            { "jshell.err.command.ambiguous", "Command: ''{0}'' is ambiguous: {1}" },
            { "jshell.err.def.or.id.not.found", "No definition or id found named: {0}" },
            { "jshell.err.drop.ambiguous", "The argument references more than one import, variable, method, or class." },
            { "jshell.err.drop.arg", "In the /drop argument, please specify an import, variable, method, or class to drop.\nSpecify by id or name. Use /list to see ids. Use /reset to reset all state." },
            { "jshell.err.failed", "Failed." },
            { "jshell.err.feedback.ambiguous.mode", "Matches more then one current feedback mode: {0} -- {1}" },
            { "jshell.err.feedback.command.quiet", "Specify either ''command'' or ''quiet'' -- {0}" },
            { "jshell.err.feedback.different.selector.kinds", "Different selector kinds in same sections of selector list ''{0}'' in ''{1}'' -- {2}" },
            { "jshell.err.feedback.does.not.match.mode", "Does not match any current feedback mode: {0} -- {1}" },
            { "jshell.err.feedback.expected.field", "Expected field name missing -- {0}" },
            { "jshell.err.feedback.expected.format", "Expected format missing -- {0}" },
            { "jshell.err.feedback.expected.mode", "Expected a feedback mode -- {0}" },
            { "jshell.err.feedback.expected.mode.name", "Expected a new feedback mode name. ''{0}'' is a known feedback mode -- {1}" },
            { "jshell.err.feedback.expected.new.feedback.mode", "Expected new feedback mode -- {0}" },
            { "jshell.err.feedback.multiple.sections", "Selector kind in multiple sections of selector list ''{0}'' in ''{1}'' -- {2}" },
            { "jshell.err.feedback.must.be.quoted", "Format ''{0}'' must be quoted -- {1}" },
            { "jshell.err.feedback.not.a.valid.selector", "Not a valid selector ''{0}'' in ''{1}'' -- {2}" },
            { "jshell.err.file.exception", "File ''{1}'' for ''{0}'' threw exception: {2}" },
            { "jshell.err.file.filename", "''{0}'' requires a filename argument." },
            { "jshell.err.file.not.accessible", "File ''{1}'' for ''{0}'' is not accessible: {2}" },
            { "jshell.err.file.not.found", "File ''{1}'' for ''{0}'' is not found: {2}" },
            { "jshell.err.help.arg", "No commands or subjects start with the provided argument: {0}" },
            { "jshell.err.no.such.command.or.snippet.id", "No such command or snippet id: {0}" },
            { "jshell.err.opt.classpath.arg", "Argument to -classpath missing." },
            { "jshell.err.opt.classpath.conflict", "Conflicting -classpath option." },
            { "jshell.err.opt.startup.conflict", "Conflicting -startup or -nostartup option." },
            { "jshell.err.opt.unknown", "Unknown option: {0}" },
            { "jshell.err.out.of.range", "Out of range" },
            { "jshell.err.reload.no.previous", "No previous history to restore" },
            { "jshell.err.reload.restarting.previous.state", "Restarting and restoring from previous state." },
            { "jshell.err.reload.restarting.state", "Restarting and restoring state." },
            { "jshell.err.set.ambiguous", "Ambiguous sub-command argument to ''/set'': {0}" },
            { "jshell.err.set.arg", "The ''/set'' command requires a sub-command and arguments. See: ''/help /set''" },
            { "jshell.err.set.editor.arg", "The ''/set editor'' command requires a path argument" },
            { "jshell.err.startup.unexpected.exception", "Unexpected exception reading start-up: {0}" },
            { "jshell.err.unexpected.exception", "Unexpected exception: {0}" },
            { "jshell.msg.classpath", "Path ''{0}'' added to classpath" },
            { "jshell.msg.drop.not.active", "The argument did not specify an active import, variable, method, or class to drop." },
            { "jshell.msg.error", "Error:" },
            { "jshell.msg.feedback.mode", "Feedback mode: {0}" },
            { "jshell.msg.feedback.mode.following", "The feedback mode should be one of the following:" },
            { "jshell.msg.feedback.new.mode", "Created new feedback mode: {0}" },
            { "jshell.msg.goodbye", "Goodbye" },
            { "jshell.msg.help.begin", "Type a Java language expression, statement, or declaration.\nOr type one of the following commands:\n" },
            { "jshell.msg.help.for.help", "Type /help for help." },
            { "jshell.msg.help.subject", "\nFor more information type ''/help'' followed by the name of command or a subject.\nFor example ''/help /list'' or ''/help intro''.  Subjects:\n" },
            { "jshell.msg.native.method", "Native Method" },
            { "jshell.msg.no.active", "There are no active definitions." },
            { "jshell.msg.resetting", "Resetting..." },
            { "jshell.msg.resetting.state", "Resetting state." },
            { "jshell.msg.see", "See {0} for help." },
            { "jshell.msg.see.classes.etc", "See /classes, /methods, /vars, or /list" },
            { "jshell.msg.set.editor.set", "Editor set to: {0}" },
            { "jshell.msg.terminated", "State engine terminated.\nRestore definitions with: /reload restore" },
            { "jshell.msg.try.list.without.args", "Try ''/list'' without arguments." },
            { "jshell.msg.try.set.editor", "Try /set editor to use external editor." },
            { "jshell.msg.unknown.source", "Unknown Source" },
            { "jshell.msg.use.one.of", "Use one of: {0}" },
            { "jshell.msg.vars.not.active", "(not-active)" },
            { "jshell.msg.warning", "Warning:" },
            { "jshell.msg.welcome", "Welcome to JShell -- Version {0}\nFor an introduction type: /help intro\n" },
            { "startup.feedback", "/set newmode normal command    \n/set prompt normal '\\n-> ' '>> '    \n/set format normal pre '|  '    \n/set format normal post '%n'    \n/set format normal errorpre '|  '    \n/set format normal errorpost '%n'    \n\n/set format normal errorline '{post}{pre}    {err}'    \n\n/set format normal action 'Added' added-primary    \n/set format normal action 'Modified' modified-primary    \n/set format normal action 'Replaced' replaced-primary    \n/set format normal action 'Overwrote' overwrote-primary    \n/set format normal action 'Dropped' dropped-primary    \n/set format normal action '  Update added' added-update    \n/set format normal action '  Update modified' modified-update    \n/set format normal action '  Update replaced' replaced-update    \n/set format normal action '  Update overwrote' overwrote-update    \n/set format normal action '  Update dropped' dropped-update    \n\n/set format normal until ', however, it cannot be instanciated or its methods invoked until'  defined-class-primary    \n/set format normal until ', however, its methods cannot be invoked until'                     defined-interface-primary    \n/set format normal until ', however, it cannot be used until'                                 defined-enum,annotation-primary    \n/set format normal until ', however, it cannot be invoked until'                              defined-method-primary    \n/set format normal until ', however, it cannot be referenced until'                           notdefined-primary    \n/set format normal until ' which cannot be instanciated or its methods invoked until'         defined-class-update    \n/set format normal until ' whose methods cannot be invoked until'                             defined-interface-update    \n/set format normal until ' which cannot be invoked until'                                     defined-method-update    \n/set format normal until ' which cannot be referenced until'                                  notdefined-update    \n\n/set format normal unrerr '{unresolved} is declared'                                           unresolved1-error0    \n/set format normal unrerr '{unresolved} are declared'                                          unresolved2-error0    \n/set format normal unrerr ' this error is corrected: {errors}'                                 unresolved0-error1    \n/set format normal unrerr '{unresolved} is declared and this error is corrected: {errors}'     unresolved1-error1    \n/set format normal unrerr '{unresolved} are declared and this error is corrected: {errors}'    unresolved2-error1    \n/set format normal unrerr ' these errors are corrected: {errors}'                              unresolved0-error2    \n/set format normal unrerr '{unresolved} is declared and these errors are corrected: {errors}'  unresolved1-error2    \n/set format normal unrerr '{unresolved} are declared and these errors are corrected: {errors}' unresolved2-error2    \n\n/set format normal resolve '{until}{unrerr}'                                                added,modified,replaced,used    \n\n/set format normal typeKind 'class'                  class    \n/set format normal typeKind 'interface'              interface    \n/set format normal typeKind 'enum'                   enum    \n/set format normal typeKind 'annotation interface'   annotation    \n\n/set format normal display '{pre}{action} {typeKind} {name}{resolve}{post}'                 class,interface,enum,annotation    \n/set format normal display '{pre}{action} method {name}({type}){resolve}{post}'             method    \n\n/set format normal display '{pre}{action} variable {name} of type {type}{resolve}{post}'    vardecl    \n/set format normal display '{pre}{action} variable {name} of type {type} with initial value {value}{resolve}{post}'    varinit    \n/set format normal display '{pre}{action} variable {name}, reset to null{post}'             replaced-vardecl,varinit-ok-update    \n/set format normal display '{pre}{action} variable {name}{resolve}{post}'                   vardecl,varinit-notdefined    \n/set format normal display '{pre}{action} variable {name}{post}'                            overwrote,dropped-vardecl,varinit    \n\n/set format normal display '{pre}Expression value is: {value}{post}{pre}  assigned to temporary variable {name} of type {type}{post}' expression    \n/set format normal display '{pre}Variable {name} of type {type} has value {value}{post}'    varvalue    \n/set format normal display '{pre}Variable {name} has been assigned the value {value}{post}' assignment    \n\n/set format normal display '{pre}Attempted to use {typeKind} {name}{resolve}{post}'         used-class,interface,enum,annotation    \n/set format normal display '{pre}Attempted to call method {name}({type}){resolve}{post}'    used-method    \n\n/set feedback normal    \n\n/set newmode off quiet    \n/set prompt off '-> ' '>> '    \n/set format off pre '|  '    \n/set format off post '%n'    \n/set format off errorpre '|  '    \n/set format off errorpost '%n'    \n/set format off display ''    \n" },
        };
    }
}
