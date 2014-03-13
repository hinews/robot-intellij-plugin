/* The following code was generated by JFlex 1.4.3 on 3/13/14 11:27 AM */

/*
   Copyright 2010 - 2013 Ed Venaglia

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.jivesoftware.robot.intellij.plugin.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.jivesoftware.robot.intellij.plugin.parser.RobotTypes;

import static com.jivesoftware.robot.intellij.plugin.parser.RobotTypes.*;

//@SuppressWarnings({ "ALL" })


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/13/14 11:27 AM from the specification file
 * <tt>/home/charles/Jive/hackday/robot-intellij-plugin/src/com/jivesoftware/robot/intellij/plugin/lexer/robot.flex</tt>
 */
class RobotScanner implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;
  private static final String ZZ_NL = System.getProperty("line.separator");

  /** lexical states */
  public static final int KEYWORDS = 4;
  public static final int YYINITIAL = 0;
  public static final int TEST_CASES = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\2\2\0\1\1\22\0\1\5\2\0\1\6\1\3"+
    "\5\0\1\34\3\0\1\44\1\0\1\43\11\13\3\0\1\11\3\0"+
    "\2\12\1\35\1\23\6\12\1\36\7\12\1\12\1\17\6\12\1\15"+
    "\1\0\1\16\1\0\1\14\1\0\1\20\1\12\1\25\1\42\1\30"+
    "\1\12\1\21\1\12\1\33\1\12\1\36\1\12\1\27\1\31\1\24"+
    "\2\12\1\41\1\22\1\32\1\26\1\12\1\40\1\12\1\37\1\12"+
    "\1\7\1\0\1\10\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\2\1\1\10\1\11\1\12\1\10\1\13\2\11"+
    "\1\10\1\3\1\14\2\11\3\0\4\1\2\0\3\15"+
    "\1\1\2\0\1\11\1\0\3\11\2\0\2\16\1\11"+
    "\5\0\1\10\1\17\2\1\10\15\1\10\1\17\2\11"+
    "\6\16\1\0\1\20\2\1\6\15\2\11\4\16\1\20"+
    "\1\21\2\1\4\15\2\11\2\16\1\22\1\23\1\1"+
    "\5\15\1\23\1\11\2\16\1\1\5\15\1\11\2\16"+
    "\1\1\4\15\1\11\2\16\1\1\3\15\1\24\1\11"+
    "\1\16\1\24\1\1\1\15\1\24\1\25\3\24\1\11"+
    "\3\24\1\1\1\25\2\24\3\25\1\11\1\24\1\1"+
    "\2\25\1\11\1\1\1\11\1\1\1\11\2\26";

  private static int [] zzUnpackAction() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\112\0\157\0\224\0\271\0\336\0\u0103"+
    "\0\u0103\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\u01e1\0\u0206"+
    "\0\u022b\0\u0250\0\u0275\0\u029a\0\u02bf\0\u02e4\0\u0309\0\u032e"+
    "\0\u0353\0\u0378\0\u039d\0\u03c2\0\u03e7\0\u040c\0\u0431\0\u0456"+
    "\0\u047b\0\u04a0\0\u04c5\0\u04ea\0\u050f\0\u0534\0\u01e1\0\u0559"+
    "\0\u057e\0\u05a3\0\u05c8\0\u05ed\0\u0612\0\u0637\0\u065c\0\u0681"+
    "\0\u06a6\0\u06cb\0\u02e4\0\u06f0\0\u0715\0\u073a\0\u075f\0\u0784"+
    "\0\u040c\0\157\0\u07a9\0\u07ce\0\u07f3\0\u0818\0\u083d\0\u0862"+
    "\0\u0887\0\u08ac\0\u08d1\0\u08f6\0\u05a3\0\u0206\0\u091b\0\u0940"+
    "\0\u0965\0\u098a\0\u09af\0\u09d4\0\u09f9\0\u0a1e\0\u0a43\0\u0a68"+
    "\0\u0a8d\0\u0ab2\0\u0ad7\0\u0afc\0\u0b21\0\u0b46\0\u0b6b\0\u0b90"+
    "\0\u0bb5\0\u0bda\0\u0bff\0\u0c24\0\u0c49\0\u0c6e\0\u0c93\0\271"+
    "\0\u0cb8\0\u0cdd\0\u0d02\0\u0d27\0\u0d4c\0\u0d71\0\u0d96\0\u0dbb"+
    "\0\u0de0\0\u0e05\0\271\0\157\0\u0e2a\0\u0e4f\0\u0e74\0\u0e99"+
    "\0\u0ebe\0\u0ee3\0\u0206\0\u0f08\0\u0f2d\0\u0f52\0\u0f77\0\u0f9c"+
    "\0\u0fc1\0\u0fe6\0\u100b\0\u1030\0\u1055\0\u107a\0\u109f\0\u10c4"+
    "\0\u10e9\0\u110e\0\u1133\0\u1158\0\u117d\0\u11a2\0\u11c7\0\u11ec"+
    "\0\u1211\0\u1236\0\u125b\0\u1280\0\u12a5\0\u12ca\0\u12ef\0\u1314"+
    "\0\u1339\0\u135e\0\u1383\0\u13a8\0\u13cd\0\u13f2\0\u1417\0\u143c"+
    "\0\u1461\0\u1486\0\u14ab\0\u14d0\0\u14f5\0\u151a\0\u153f\0\u1564"+
    "\0\u1589\0\u15ae\0\u15d3\0\u15f8\0\u161d\0\u1642\0\u1667\0\u168c"+
    "\0\u16b1\0\u16d6\0\u16fb\0\157\0\u0206";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\3\4"+
    "\1\13\1\14\1\4\1\15\1\4\15\13\1\16\6\13"+
    "\1\17\1\4\1\20\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\3\20\1\21\1\22\1\23\1\24\1\20\15\21"+
    "\1\25\6\21\1\26\2\20\1\5\1\6\1\27\1\10"+
    "\1\11\1\12\3\20\1\30\1\22\1\20\1\31\1\20"+
    "\15\30\1\32\6\30\1\26\1\20\1\4\4\0\1\33"+
    "\37\4\2\0\1\6\116\0\1\34\41\0\2\10\37\0"+
    "\1\12\2\0\42\12\1\4\4\0\1\35\4\4\2\13"+
    "\3\4\15\13\1\4\7\13\2\4\4\0\1\33\5\4"+
    "\1\14\27\4\1\14\1\36\1\4\4\0\1\33\4\4"+
    "\1\37\1\4\1\37\2\4\1\40\3\37\1\41\6\37"+
    "\1\40\1\37\1\4\5\37\1\41\3\4\3\0\1\42"+
    "\1\43\4\4\1\44\1\4\1\44\2\4\1\45\12\44"+
    "\1\45\1\44\1\16\1\44\1\46\4\44\3\4\4\0"+
    "\1\33\5\4\1\47\27\4\1\47\1\36\1\20\4\0"+
    "\1\50\40\20\4\0\1\51\4\20\2\21\1\23\2\20"+
    "\15\21\1\20\7\21\2\20\4\0\1\50\5\20\1\22"+
    "\27\20\1\22\1\52\1\20\4\0\1\53\4\20\3\23"+
    "\2\20\15\23\1\20\7\23\2\20\4\0\1\50\4\20"+
    "\1\54\1\20\1\54\2\20\1\55\3\54\1\56\6\54"+
    "\1\55\1\54\1\20\5\54\1\56\3\20\3\0\1\57"+
    "\1\60\4\20\1\61\1\20\1\61\2\20\15\61\1\25"+
    "\1\61\1\62\4\61\3\20\4\0\1\50\5\20\1\63"+
    "\27\20\1\63\1\52\7\0\1\64\35\0\1\20\4\0"+
    "\1\65\4\20\2\30\3\20\15\30\1\20\7\30\2\20"+
    "\4\0\1\50\4\20\1\54\1\20\1\54\2\20\4\54"+
    "\1\56\10\54\1\20\5\54\1\56\3\20\3\0\1\66"+
    "\1\67\4\20\1\61\1\20\1\61\2\20\15\61\1\32"+
    "\6\61\2\20\1\4\5\0\37\4\12\0\1\70\1\0"+
    "\1\70\2\0\15\70\1\0\6\70\2\0\1\4\5\0"+
    "\4\4\1\13\4\4\15\13\1\4\6\13\3\4\4\0"+
    "\1\33\5\4\1\71\27\4\1\71\2\4\4\0\1\33"+
    "\4\4\3\37\1\4\1\72\15\37\1\4\7\37\2\4"+
    "\4\0\1\33\4\4\3\37\1\4\1\72\1\37\1\73"+
    "\13\37\1\4\7\37\2\4\4\0\1\33\4\4\3\37"+
    "\1\4\1\72\5\37\1\74\7\37\1\4\7\37\1\4"+
    "\4\0\2\42\4\0\1\75\1\0\1\75\2\0\1\76"+
    "\12\75\1\76\1\75\1\0\1\75\1\77\4\75\2\0"+
    "\1\4\3\0\2\42\4\4\1\44\1\4\1\44\2\4"+
    "\1\45\12\44\1\45\1\44\1\4\1\44\1\46\4\44"+
    "\3\4\3\0\1\100\1\101\4\4\3\44\2\4\15\44"+
    "\1\102\7\44\2\4\3\0\1\100\1\101\4\4\3\44"+
    "\2\4\11\44\1\103\3\44\1\102\7\44\2\4\3\0"+
    "\1\100\1\101\4\4\3\44\2\4\11\44\1\104\3\44"+
    "\1\102\7\44\1\4\1\20\5\0\40\20\5\0\4\20"+
    "\1\21\1\20\1\23\2\20\15\21\1\20\6\21\3\20"+
    "\4\0\1\50\5\20\1\105\27\20\1\105\2\20\5\0"+
    "\4\20\1\23\1\20\1\23\2\20\15\23\1\20\6\23"+
    "\3\20\4\0\1\50\4\20\3\54\1\20\1\106\15\54"+
    "\1\20\7\54\2\20\4\0\1\50\4\20\3\54\1\20"+
    "\1\106\1\54\1\107\13\54\1\20\7\54\2\20\4\0"+
    "\1\50\4\20\3\54\1\20\1\106\5\54\1\110\7\54"+
    "\1\20\7\54\1\20\4\0\2\57\4\0\1\111\1\0"+
    "\1\111\2\0\15\111\1\0\1\111\1\112\4\111\2\0"+
    "\1\20\3\0\2\57\4\20\1\61\1\20\1\61\2\20"+
    "\15\61\1\20\1\61\1\62\4\61\3\20\3\0\1\113"+
    "\1\114\4\20\3\61\2\20\15\61\1\115\7\61\2\20"+
    "\3\0\1\113\1\114\4\20\3\61\2\20\11\61\1\116"+
    "\3\61\1\115\7\61\1\20\12\0\1\117\1\0\1\117"+
    "\2\0\15\117\1\0\6\117\2\0\1\20\5\0\4\20"+
    "\1\30\4\20\15\30\1\20\6\30\2\20\4\0\2\66"+
    "\4\0\1\111\1\0\1\111\2\0\15\111\1\0\6\111"+
    "\2\0\1\20\3\0\2\66\4\20\1\61\1\20\1\61"+
    "\2\20\15\61\1\20\6\61\2\20\10\0\1\120\1\0"+
    "\3\70\2\0\15\70\1\0\7\70\1\0\1\4\4\0"+
    "\1\33\4\4\3\37\1\4\1\72\2\37\1\121\12\37"+
    "\1\4\7\37\2\4\4\0\1\33\4\4\3\37\1\4"+
    "\1\72\6\37\1\122\6\37\1\4\7\37\1\4\4\0"+
    "\1\100\1\123\4\0\3\75\2\0\15\75\1\124\7\75"+
    "\5\0\1\100\1\123\4\0\3\75\2\0\11\75\1\125"+
    "\3\75\1\124\7\75\5\0\1\100\1\123\4\0\3\75"+
    "\2\0\11\75\1\126\3\75\1\124\7\75\5\0\2\100"+
    "\26\0\1\124\10\0\1\4\3\0\2\100\4\4\1\44"+
    "\1\4\1\44\2\4\15\44\1\102\6\44\3\4\4\0"+
    "\1\33\26\4\1\102\11\4\3\0\1\100\1\101\4\4"+
    "\3\44\2\4\3\44\1\127\11\44\1\102\7\44\2\4"+
    "\3\0\1\100\1\101\4\4\3\44\2\4\15\44\1\102"+
    "\2\44\1\130\4\44\1\4\1\20\4\0\1\50\4\20"+
    "\3\54\1\20\1\106\2\54\1\131\12\54\1\20\7\54"+
    "\2\20\4\0\1\50\4\20\3\54\1\20\1\106\6\54"+
    "\1\132\6\54\1\20\7\54\1\20\4\0\1\113\1\133"+
    "\4\0\3\111\2\0\15\111\1\134\7\111\5\0\1\113"+
    "\1\133\4\0\3\111\2\0\11\111\1\135\3\111\1\134"+
    "\7\111\5\0\2\113\26\0\1\134\10\0\1\20\3\0"+
    "\2\113\4\20\1\61\1\20\1\61\2\20\15\61\1\115"+
    "\6\61\3\20\4\0\1\50\26\20\1\115\11\20\3\0"+
    "\1\113\1\114\4\20\3\61\2\20\15\61\1\115\2\61"+
    "\1\136\4\61\1\20\10\0\1\137\1\0\3\117\2\0"+
    "\15\117\1\0\7\117\12\0\1\140\33\0\1\4\4\0"+
    "\1\33\4\4\3\37\1\4\1\72\3\37\1\141\11\37"+
    "\1\4\7\37\2\4\4\0\1\33\4\4\3\37\1\4"+
    "\1\72\7\37\1\142\5\37\1\4\7\37\1\4\4\0"+
    "\2\100\4\0\1\75\1\0\1\75\2\0\15\75\1\124"+
    "\6\75\36\0\1\124\14\0\1\100\1\123\4\0\3\75"+
    "\2\0\3\75\1\143\11\75\1\124\7\75\5\0\1\100"+
    "\1\123\4\0\3\75\2\0\15\75\1\124\2\75\1\144"+
    "\4\75\1\0\1\4\3\0\1\100\1\101\4\4\3\44"+
    "\2\4\13\44\1\145\1\44\1\102\7\44\2\4\3\0"+
    "\1\100\1\101\4\4\3\44\2\4\15\44\1\102\3\44"+
    "\1\146\3\44\1\4\1\20\4\0\1\50\4\20\3\54"+
    "\1\20\1\106\3\54\1\147\11\54\1\20\7\54\2\20"+
    "\4\0\1\50\4\20\3\54\1\20\1\106\7\54\1\150"+
    "\5\54\1\20\7\54\1\20\4\0\2\113\4\0\1\111"+
    "\1\0\1\111\2\0\15\111\1\134\6\111\36\0\1\134"+
    "\14\0\1\113\1\133\4\0\3\111\2\0\15\111\1\134"+
    "\2\111\1\151\4\111\1\0\1\20\3\0\1\113\1\114"+
    "\4\20\3\61\2\20\15\61\1\115\3\61\1\152\3\61"+
    "\1\20\11\0\1\153\33\0\1\4\4\0\1\33\4\4"+
    "\3\37\1\4\1\154\15\37\1\4\7\37\2\4\4\0"+
    "\1\33\4\4\3\37\1\4\1\72\10\37\1\155\4\37"+
    "\1\4\7\37\1\4\4\0\1\100\1\123\4\0\3\75"+
    "\2\0\13\75\1\156\1\75\1\124\7\75\5\0\1\100"+
    "\1\123\4\0\3\75\2\0\15\75\1\124\3\75\1\157"+
    "\3\75\1\0\1\4\3\0\1\100\1\160\4\4\3\44"+
    "\2\4\6\44\1\161\6\44\1\102\1\161\6\44\2\4"+
    "\3\0\1\100\1\101\4\4\3\44\2\4\5\44\1\162"+
    "\7\44\1\102\7\44\1\4\1\20\4\0\1\50\4\20"+
    "\3\54\1\20\1\163\15\54\1\20\7\54\2\20\4\0"+
    "\1\50\4\20\3\54\1\20\1\106\10\54\1\164\4\54"+
    "\1\20\7\54\1\20\4\0\1\113\1\133\4\0\3\111"+
    "\2\0\15\111\1\134\3\111\1\165\3\111\1\0\1\20"+
    "\3\0\1\113\1\114\4\20\3\61\2\20\5\61\1\166"+
    "\7\61\1\115\7\61\1\20\1\4\4\0\1\33\4\4"+
    "\3\37\1\4\1\72\11\37\1\167\3\37\1\4\7\37"+
    "\1\4\4\0\1\100\1\170\4\0\3\75\2\0\6\75"+
    "\1\171\6\75\1\124\1\171\6\75\5\0\1\100\1\123"+
    "\4\0\3\75\2\0\5\75\1\172\7\75\1\124\7\75"+
    "\1\0\1\4\3\0\2\100\4\4\1\44\1\4\1\44"+
    "\2\4\6\44\1\161\6\44\1\102\1\161\5\44\3\4"+
    "\3\0\1\100\1\101\4\4\3\44\2\4\1\44\1\173"+
    "\13\44\1\102\7\44\2\4\3\0\1\100\1\101\4\4"+
    "\3\44\2\4\15\44\1\102\4\44\1\174\2\44\1\4"+
    "\1\20\4\0\1\50\4\20\3\54\1\20\1\106\11\54"+
    "\1\175\3\54\1\20\7\54\1\20\4\0\1\113\1\133"+
    "\4\0\3\111\2\0\5\111\1\176\7\111\1\134\7\111"+
    "\1\0\1\20\3\0\1\113\1\114\4\20\3\61\2\20"+
    "\15\61\1\115\4\61\1\177\2\61\1\20\1\4\4\0"+
    "\1\33\4\4\3\37\1\4\1\72\12\37\1\200\2\37"+
    "\1\4\7\37\1\4\4\0\2\100\4\0\1\75\1\0"+
    "\1\75\2\0\6\75\1\171\6\75\1\124\1\171\5\75"+
    "\6\0\1\100\1\123\4\0\3\75\2\0\1\75\1\201"+
    "\13\75\1\124\7\75\5\0\1\100\1\123\4\0\3\75"+
    "\2\0\15\75\1\124\4\75\1\202\2\75\1\0\1\4"+
    "\3\0\1\100\1\101\4\4\3\44\2\4\3\44\1\203"+
    "\11\44\1\102\7\44\2\4\3\0\1\100\1\101\4\4"+
    "\3\44\2\4\15\44\1\102\5\44\1\204\1\44\1\4"+
    "\1\20\4\0\1\50\4\20\3\54\1\20\1\106\12\54"+
    "\1\205\2\54\1\20\7\54\1\20\4\0\1\113\1\133"+
    "\4\0\3\111\2\0\15\111\1\134\4\111\1\206\2\111"+
    "\1\0\1\20\3\0\1\113\1\114\4\20\3\61\2\20"+
    "\15\61\1\115\5\61\1\207\1\61\1\20\1\4\4\0"+
    "\1\33\4\4\3\37\1\4\1\72\13\37\1\210\1\37"+
    "\1\4\7\37\1\4\4\0\1\100\1\123\4\0\3\75"+
    "\2\0\3\75\1\211\11\75\1\124\7\75\5\0\1\100"+
    "\1\123\4\0\3\75\2\0\15\75\1\124\5\75\1\212"+
    "\1\75\1\0\1\4\3\0\1\100\1\101\4\4\3\44"+
    "\2\4\11\44\1\213\3\44\1\102\7\44\2\4\3\0"+
    "\1\100\1\101\4\4\3\44\2\4\3\44\1\214\11\44"+
    "\1\102\7\44\1\4\1\20\4\0\1\50\4\20\3\54"+
    "\1\20\1\106\13\54\1\215\1\54\1\20\7\54\1\20"+
    "\4\0\1\113\1\133\4\0\3\111\2\0\15\111\1\134"+
    "\5\111\1\216\1\111\1\0\1\20\3\0\1\113\1\114"+
    "\4\20\3\61\2\20\3\61\1\217\11\61\1\115\7\61"+
    "\1\20\1\4\4\0\1\33\4\4\3\37\1\4\1\72"+
    "\1\37\1\220\13\37\1\4\7\37\1\4\4\0\1\100"+
    "\1\123\4\0\3\75\2\0\11\75\1\221\3\75\1\124"+
    "\7\75\5\0\1\100\1\123\4\0\3\75\2\0\3\75"+
    "\1\222\11\75\1\124\7\75\1\0\1\4\3\0\1\100"+
    "\1\101\4\4\3\44\2\4\3\44\1\223\11\44\1\102"+
    "\7\44\2\4\3\0\1\224\1\225\4\4\3\44\2\4"+
    "\15\44\1\226\7\44\1\4\1\20\4\0\1\50\4\20"+
    "\3\54\1\20\1\106\1\54\1\227\13\54\1\20\7\54"+
    "\1\20\4\0\1\113\1\133\4\0\3\111\2\0\3\111"+
    "\1\230\11\111\1\134\7\111\1\0\1\20\3\0\1\224"+
    "\1\231\4\20\3\61\2\20\15\61\1\232\7\61\1\20"+
    "\1\4\4\0\1\33\4\4\3\37\1\4\1\72\13\37"+
    "\1\233\1\37\1\4\7\37\1\4\4\0\1\100\1\123"+
    "\4\0\3\75\2\0\3\75\1\234\11\75\1\124\7\75"+
    "\5\0\1\224\1\235\4\0\3\75\2\0\15\75\1\236"+
    "\7\75\1\0\1\4\3\0\1\237\1\240\4\4\3\44"+
    "\2\4\15\44\1\241\7\44\1\4\4\0\2\224\26\0"+
    "\1\236\10\0\1\4\3\0\2\224\4\4\1\44\1\4"+
    "\1\44\2\4\15\44\1\226\6\44\3\4\4\0\1\33"+
    "\26\4\1\226\10\4\1\20\4\0\1\50\4\20\3\54"+
    "\1\20\1\106\13\54\1\242\1\54\1\20\7\54\1\20"+
    "\4\0\1\224\1\243\4\0\3\111\2\0\15\111\1\236"+
    "\7\111\1\0\1\20\3\0\2\224\4\20\1\61\1\20"+
    "\1\61\2\20\15\61\1\232\6\61\3\20\4\0\1\50"+
    "\26\20\1\232\10\20\1\4\4\0\1\33\4\4\3\37"+
    "\1\4\1\72\14\37\1\244\1\4\7\37\1\4\4\0"+
    "\1\237\1\245\4\0\3\75\2\0\15\75\1\246\7\75"+
    "\5\0\2\224\4\0\1\75\1\0\1\75\2\0\15\75"+
    "\1\236\6\75\36\0\1\236\14\0\2\237\26\0\1\246"+
    "\10\0\1\4\3\0\2\237\4\4\1\44\1\4\1\44"+
    "\2\4\15\44\1\241\6\44\3\4\4\0\1\33\26\4"+
    "\1\241\10\4\1\20\4\0\1\50\4\20\3\54\1\20"+
    "\1\106\14\54\1\247\1\20\7\54\1\20\4\0\2\224"+
    "\4\0\1\111\1\0\1\111\2\0\15\111\1\236\6\111"+
    "\2\0\1\4\4\0\1\33\4\4\3\37\1\4\1\72"+
    "\5\37\1\250\7\37\1\4\7\37\1\4\4\0\2\237"+
    "\4\0\1\75\1\0\1\75\2\0\15\75\1\246\6\75"+
    "\36\0\1\246\10\0\1\20\4\0\1\50\4\20\3\54"+
    "\1\20\1\106\5\54\1\251\7\54\1\20\7\54\1\20"+
    "\1\4\4\0\1\33\4\4\3\37\1\4\1\72\12\37"+
    "\1\252\2\37\1\4\7\37\1\4\1\20\4\0\1\50"+
    "\4\20\3\54\1\20\1\106\12\54\1\253\2\54\1\20"+
    "\7\54\1\20\1\4\4\0\1\33\4\4\3\37\1\4"+
    "\1\254\15\37\1\4\7\37\1\4\1\20\4\0\1\50"+
    "\4\20\3\54\1\20\1\255\15\54\1\20\7\54\1\20";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5920];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\2\1\1\11\24\1\3\0\4\1\2\0\4\1"+
    "\2\0\1\1\1\0\3\1\2\0\3\1\5\0\26\1"+
    "\1\0\20\1\1\11\12\1\1\11\102\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[173];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  int yyline, yycolumn, yychar;
  private boolean onTagsLine = false;
  private boolean onDocsLine = false;
  private boolean keywordToLeft = false;
  private boolean startLine = true;

  private IElementType next(IElementType toReturn) {
    startLine = false;
    return toReturn;
  }
  private IElementType newLine() {
    startLine = true;
    keywordToLeft = onTagsLine = onDocsLine = false;
    return RobotTypes.NEWLINE_TOKEN;
  }




  RobotScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  RobotScanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 128) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch ((zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL] : zzBufferL.charAt(zzCurrentPosL))) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 15: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [121] { return next(META_INFO_TOKEN); }");
          { return next(META_INFO_TOKEN);
          }
        case 23: break;
        case 1: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [131] { if (onTagsLine) { return next(TAG_TOKEN); }"+ZZ_NL+"                          if (onDocsLine) { return next(DOCUMENTATION_TOKEN);}"+ZZ_NL+"                            return next(ROBOT_KEYWORD_ARG_TOKEN); }");
          { if (onTagsLine) { return next(TAG_TOKEN); }
                          if (onDocsLine) { return next(DOCUMENTATION_TOKEN);}
                            return next(ROBOT_KEYWORD_ARG_TOKEN);
          }
        case 24: break;
        case 12: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [182] { if (startLine) { return next(ROBOT_KEYWORD_DEF_TOKEN); }"+ZZ_NL+"                           if (keywordToLeft) { return next(ROBOT_KEYWORD_ARG_TOKEN); }"+ZZ_NL+"                           keywordToLeft= true; return next(ROBOT_KEYWORD_TOKEN); }");
          { if (startLine) { return next(ROBOT_KEYWORD_DEF_TOKEN); }
                           if (keywordToLeft) { return next(ROBOT_KEYWORD_ARG_TOKEN); }
                           keywordToLeft= true; return next(ROBOT_KEYWORD_TOKEN);
          }
        case 25: break;
        case 11: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [160] { if (startLine) { return next(TEST_CASE_HEADER_TOKEN);  } return next(ROBOT_KEYWORD_ARG_TOKEN); }");
          { if (startLine) { return next(TEST_CASE_HEADER_TOKEN);  } return next(ROBOT_KEYWORD_ARG_TOKEN);
          }
        case 26: break;
        case 9: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [163] { return next(ROBOT_KEYWORD_ARG_TOKEN); }");
          { return next(ROBOT_KEYWORD_ARG_TOKEN);
          }
        case 27: break;
        case 4: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [134] { return next(COLUMN_SEP_TOKEN); }");
          { return next(COLUMN_SEP_TOKEN);
          }
        case 28: break;
        case 22: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [120] { onDocsLine = true; return next(META_INFO_TOKEN); }");
          { onDocsLine = true; return next(META_INFO_TOKEN);
          }
        case 29: break;
        case 14: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [148] { yybegin(YYINITIAL); return next(TABLE_HEADING_TOKEN); }");
          { yybegin(YYINITIAL); return next(TABLE_HEADING_TOKEN);
          }
        case 30: break;
        case 3: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [137] { return next(BAD_CHAR_TOKEN); }");
          { return next(BAD_CHAR_TOKEN);
          }
        case 31: break;
        case 17: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [124] { return next(ASSIGNMENT_TOKEN); }");
          { return next(ASSIGNMENT_TOKEN);
          }
        case 32: break;
        case 7: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [126] { if (onTagsLine) { return next(TAG_TOKEN); }"+ZZ_NL+"                          if (onDocsLine) { return next(DOCUMENTATION_TOKEN);}"+ZZ_NL+"                          if (keywordToLeft) { return next(ROBOT_KEYWORD_ARG_TOKEN); }"+ZZ_NL+"                          keywordToLeft = true; return next(ROBOT_KEYWORD_TOKEN); }");
          { if (onTagsLine) { return next(TAG_TOKEN); }
                          if (onDocsLine) { return next(DOCUMENTATION_TOKEN);}
                          if (keywordToLeft) { return next(ROBOT_KEYWORD_ARG_TOKEN); }
                          keywordToLeft = true; return next(ROBOT_KEYWORD_TOKEN);
          }
        case 33: break;
        case 21: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [116] { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADING_TOKEN); }");
          { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADING_TOKEN);
          }
        case 34: break;
        case 8: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [130] { return next(NUMBER_LITERAL_TOKEN); }");
          { return next(NUMBER_LITERAL_TOKEN);
          }
        case 35: break;
        case 19: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [119] { onTagsLine = true; return next(META_INFO_TOKEN); }");
          { onTagsLine = true; return next(META_INFO_TOKEN);
          }
        case 36: break;
        case 5: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [135] { return next(SINGLE_SPACE_TOKEN); }");
          { return next(SINGLE_SPACE_TOKEN);
          }
        case 37: break;
        case 6: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [123] { return next(COMMENT_TOKEN); }");
          { return next(COMMENT_TOKEN);
          }
        case 38: break;
        case 13: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [118] { return next(TABLE_HEADING_TOKEN); }");
          { return next(TABLE_HEADING_TOKEN);
          }
        case 39: break;
        case 20: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [117] { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADING_TOKEN); }");
          { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADING_TOKEN);
          }
        case 40: break;
        case 2: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [115] { return newLine(); }");
          { return newLine();
          }
        case 41: break;
        case 10: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [155] { if (startLine) { return next(TEST_CASE_HEADER_TOKEN); }"+ZZ_NL+"                           if (onTagsLine) { return next(TAG_TOKEN); }"+ZZ_NL+"                           if (onDocsLine) { return next(DOCUMENTATION_TOKEN); }"+ZZ_NL+"                           if (keywordToLeft) { return next(ROBOT_KEYWORD_ARG_TOKEN); }"+ZZ_NL+"                           keywordToLeft= true; return next(ROBOT_KEYWORD_TOKEN); }");
          { if (startLine) { return next(TEST_CASE_HEADER_TOKEN); }
                           if (onTagsLine) { return next(TAG_TOKEN); }
                           if (onDocsLine) { return next(DOCUMENTATION_TOKEN); }
                           if (keywordToLeft) { return next(ROBOT_KEYWORD_ARG_TOKEN); }
                           keywordToLeft= true; return next(ROBOT_KEYWORD_TOKEN);
          }
        case 42: break;
        case 18: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [181] { return ASSIGNMENT_TOKEN; }");
          { return ASSIGNMENT_TOKEN;
          }
        case 43: break;
        case 16: 
          System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: --"+yytext()+"--");
          System.out.println("action [125] { return next(VARIABLE_TOKEN); }");
          { return next(VARIABLE_TOKEN);
          }
        case 44: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case KEYWORDS: {
              System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: <<EOF>>");
              System.out.println("action [193] { yybegin(YYINITIAL); }");
              yybegin(YYINITIAL);
            }
            case 174: break;
            case YYINITIAL: {
              System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: <<EOF>>");
              System.out.println("action [139] { return null; }");
              return null;
            }
            case 175: break;
            case TEST_CASES: {
              System.out.println("line: "+(yyline+1)+" "+"col: "+(yycolumn+1)+" "+"match: <<EOF>>");
              System.out.println("action [169] { yybegin(YYINITIAL); }");
              yybegin(YYINITIAL);
            }
            case 176: break;
            default:
            return null;
            }
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java RobotScanner <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        RobotScanner scanner = null;
        try {
          scanner = new RobotScanner( new java.io.FileReader(argv[i]) );
          do {
            System.out.println(scanner.advance());
          } while (!scanner.zzAtEOF);

        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
