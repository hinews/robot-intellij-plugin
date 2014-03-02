package com.jivesoftware.robot.intellij.plugin.lexer;

/*
 * Copyright 2010 - 2013 Ed Venaglia
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import com.jivesoftware.robot.intellij.plugin.lang.RobotLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * User: ed
 * Date: Jul 9, 2010
 * Time: 2:40:27 PM
 *
 * Class to represent and statically enumerate all supported lexer token types
 * generated by the soy flex lexer.
 */
public final class RobotToken extends IElementType {

  public enum TYPE {TABLE_HEADING, TEST_CASES_TABLE_HEADING, TEST_CASE_HEADER, META_INFO, ROBOT_KEYWORD, ROBOT_KEYWORD_ARG, VARIABLE, ASSIGNMENT, COMMENT,
    NUMBER_LITERAL,
    COLUMN_SEPARATOR, SINGLE_SPACE, NEWLINE, WHITESPACE, BAD_CHAR}

  public static final RobotToken TABLE_HEADING_TOKEN = create(TYPE.TABLE_HEADING);
  public static final RobotToken TEST_CASES_TABLE_HEADING_TOKEN = create(TYPE.TEST_CASES_TABLE_HEADING);
  public static final RobotToken TEST_CASE_HEADER_TOKEN = create(TYPE.TEST_CASE_HEADER);
  public static final RobotToken ROBOT_KEYWORD_TOKEN = create(TYPE.ROBOT_KEYWORD);
  public static final RobotToken ROBOT_KEYWORD_ARG_TOKEN = create(TYPE.ROBOT_KEYWORD_ARG);
  public static final RobotToken COMMENT_TOKEN = create(TYPE.COMMENT);
  public static final RobotToken VARIABLE_TOKEN = create(TYPE.VARIABLE);
  public static final RobotToken ASSIGNMENT_TOKEN = create(TYPE.ASSIGNMENT);
  public static final RobotToken META_INFO_TOKEN = create(TYPE.META_INFO);
  public static final RobotToken NUMBER_LITERAL_TOKEN = create(TYPE.NUMBER_LITERAL);
  public static final RobotToken COLUMN_SEP_TOKEN = create(TYPE.COLUMN_SEPARATOR);
  public static final RobotToken SINGLE_SPACE_TOKEN = create(TYPE.SINGLE_SPACE);
  public static final RobotToken WHITESPACE_TOKEN = create(TYPE.WHITESPACE);
  public static final RobotToken NEWLINE_TOKEN = create(TYPE.NEWLINE);
  public static final RobotToken BAD_CHAR_TOKEN = create(TYPE.BAD_CHAR);

  private final TYPE type;

  private static RobotToken create(TYPE type) {
    return new RobotToken(type);
  }

  private RobotToken(@NotNull @NonNls TYPE type) {
    this(type, RobotLanguage.INSTANCE);
  }

  private RobotToken(@NotNull @NonNls TYPE type,
                     Language l) {
    super(type.toString(), l, true);
    this.type = type;
  }

  public TYPE getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RobotToken robotToken = (RobotToken) o;
    return type == robotToken.type;
  }

  @Override
  public int hashCode() {
    return type.hashCode();
  }

  private static int hashCodeNullable(@Nullable Object o) {
    return o == null ? 0 : o.hashCode();
  }

  @Override
  public String toString() {
    return type.toString();
  }

}
