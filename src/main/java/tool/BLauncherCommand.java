/*
 * Copyright (c) 2019, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tool;

import picocli.CommandLine;

import java.io.IOException;

/**
 * {@code BLauncherCommand} represents a Ballerina launcher command.
 *
 * @since 0.8.0
 */
public interface BLauncherCommand {

    /**
     * Execute the command.
     */
    void execute();

    /**
     * Retrieve the command name.
     *
     * @return the name of the command
     */
    String getName();

    /**
     * Print the detailed description of the command.
     *
     * @param out a {@link StringBuilder} instance
     */
    void printLongDesc(StringBuilder out);

    /**
     * Print usgae info for the command.
     *
     * @param out a {@link StringBuilder} instance
     */
    void printUsage(StringBuilder out);

    /**
     * Set the parent {@link CommandLine} object to which commands are added as sub commands.
     *
     * @param parentCmdParser the parent {@link CommandLine} object
     */
    void setParentCmdParser(CommandLine parentCmdParser);

    /**
     * Retrieve command usage info.
     *
     * @param  commandName the name of the command
     * @return usage info for the specified command
     */
    static String getCommandUsageInfo(String commandName) {
        String fileName = "cli-help/ballerina-" + commandName + ".help";
        return "help not implemented";
//        try {
////            return BCompileUtil.readFileAsString(fileName);
//            //TODO: fix later
//
//        } catch (IOException e) {
//            throw LauncherUtils.createUsageExceptionWithHelp("usage info not available for command: " + commandName);
//        }
    }
}
