// This is a generated file. Not intended for manual editing.
package com.jivesoftware.robot.intellij.plugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.jivesoftware.robot.intellij.plugin.elements.references.RobotNamedElement;
import com.intellij.psi.StubBasedPsiElement;
import com.jivesoftware.robot.intellij.plugin.elements.stubindex.RobotKeywordStub;
import com.jivesoftware.robot.intellij.plugin.elements.stubindex.RobotKeywordArgStub;
import com.jivesoftware.robot.intellij.plugin.elements.stubindex.RobotKeywordTitleStub;
import com.jivesoftware.robot.intellij.plugin.elements.stubindex.RobotScalarAssignmentStub;
import com.jivesoftware.robot.intellij.plugin.elements.stubindex.RobotScalarVariableStub;
import com.jivesoftware.robot.intellij.plugin.elements.stubindex.RobotTestCaseStub;

public class RobotVisitor extends PsiElementVisitor {

  public void visitArgumentsSetting(@NotNull RobotArgumentsSetting o) {
    visitPsiElement(o);
  }

  public void visitArgumentDef(@NotNull RobotArgumentDef o) {
    visitNamedElement(o);
  }

  public void visitArrayAssignableInVariablesTbl(@NotNull RobotArrayAssignableInVariablesTbl o) {
    visitPsiElement(o);
  }

  public void visitArrayAssignment(@NotNull RobotArrayAssignment o) {
    visitPsiElement(o);
  }

  public void visitArrayAssignmentLhs(@NotNull RobotArrayAssignmentLhs o) {
    visitPsiElement(o);
  }

  public void visitArrayVariable(@NotNull RobotArrayVariable o) {
    visitPsiElement(o);
  }

  public void visitAssignableInVariablesTbl(@NotNull RobotAssignableInVariablesTbl o) {
    visitPsiElement(o);
  }

  public void visitAssignment(@NotNull RobotAssignment o) {
    visitPsiElement(o);
  }

  public void visitDocumentationMeta(@NotNull RobotDocumentationMeta o) {
    visitPsiElement(o);
  }

  public void visitDocumentationSetting(@NotNull RobotDocumentationSetting o) {
    visitPsiElement(o);
  }

  public void visitDoubleBoundForLoop(@NotNull RobotDoubleBoundForLoop o) {
    visitPsiElement(o);
  }

  public void visitDoubleBoundForLoopWithStep(@NotNull RobotDoubleBoundForLoopWithStep o) {
    visitPsiElement(o);
  }

  public void visitEllipses(@NotNull RobotEllipses o) {
    visitPsiElement(o);
  }

  public void visitEllipsesLineTest(@NotNull RobotEllipsesLineTest o) {
    visitPsiElement(o);
  }

  public void visitEmptyLine(@NotNull RobotEmptyLine o) {
    visitPsiElement(o);
  }

  public void visitError(@NotNull RobotError o) {
    visitPsiElement(o);
  }

  public void visitExecutionLine(@NotNull RobotExecutionLine o) {
    visitPsiElement(o);
  }

  public void visitForceTagsSetting(@NotNull RobotForceTagsSetting o) {
    visitPsiElement(o);
  }

  public void visitForLoopIn(@NotNull RobotForLoopIn o) {
    visitPsiElement(o);
  }

  public void visitForLoopInRange(@NotNull RobotForLoopInRange o) {
    visitPsiElement(o);
  }

  public void visitForLoopValueList(@NotNull RobotForLoopValueList o) {
    visitPsiElement(o);
  }

  public void visitForVarIn(@NotNull RobotForVarIn o) {
    visitPsiElement(o);
  }

  public void visitForVarInRange(@NotNull RobotForVarInRange o) {
    visitPsiElement(o);
  }

  public void visitGenericSetting(@NotNull RobotGenericSetting o) {
    visitPsiElement(o);
  }

  public void visitGenericSettingName(@NotNull RobotGenericSettingName o) {
    visitPsiElement(o);
  }

  public void visitIndentedKeywordInvocationTest(@NotNull RobotIndentedKeywordInvocationTest o) {
    visitPsiElement(o);
  }

  public void visitIndentedVariableAssignToKeyword(@NotNull RobotIndentedVariableAssignToKeyword o) {
    visitPsiElement(o);
  }

  public void visitJavaClassReference(@NotNull RobotJavaClassReference o) {
    visitPsiElement(o);
  }

  public void visitKeyword(@NotNull RobotKeyword o) {
    visitNamedElement(o);
    // visitKeywordStub>(o);
  }

  public void visitKeywordsTable(@NotNull RobotKeywordsTable o) {
    visitPsiElement(o);
  }

  public void visitKeywordsTableHeading(@NotNull RobotKeywordsTableHeading o) {
    visitPsiElement(o);
  }

  public void visitKeywordArg(@NotNull RobotKeywordArg o) {
    visitNamedElement(o);
    // visitKeywordArgStub>(o);
  }

  public void visitKeywordArgList(@NotNull RobotKeywordArgList o) {
    visitPsiElement(o);
  }

  public void visitKeywordDefinition(@NotNull RobotKeywordDefinition o) {
    visitPsiElement(o);
  }

  public void visitKeywordInvocationSettings(@NotNull RobotKeywordInvocationSettings o) {
    visitPsiElement(o);
  }

  public void visitKeywordInvocationTest(@NotNull RobotKeywordInvocationTest o) {
    visitPsiElement(o);
  }

  public void visitKeywordLine(@NotNull RobotKeywordLine o) {
    visitPsiElement(o);
  }

  public void visitKeywordSetting(@NotNull RobotKeywordSetting o) {
    visitPsiElement(o);
  }

  public void visitKeywordSettingLine(@NotNull RobotKeywordSettingLine o) {
    visitPsiElement(o);
  }

  public void visitKeywordTitle(@NotNull RobotKeywordTitle o) {
    visitNamedElement(o);
    // visitKeywordTitleStub>(o);
  }

  public void visitLibrarySetting(@NotNull RobotLibrarySetting o) {
    visitPsiElement(o);
  }

  public void visitMetadataSetting(@NotNull RobotMetadataSetting o) {
    visitPsiElement(o);
  }

  public void visitMultiAssignmentLhs(@NotNull RobotMultiAssignmentLhs o) {
    visitPsiElement(o);
  }

  public void visitResourceFile(@NotNull RobotResourceFile o) {
    visitNamedElement(o);
  }

  public void visitResourceSetting(@NotNull RobotResourceSetting o) {
    visitPsiElement(o);
  }

  public void visitReturnLine(@NotNull RobotReturnLine o) {
    visitPsiElement(o);
  }

  public void visitReturnSetting(@NotNull RobotReturnSetting o) {
    visitPsiElement(o);
  }

  public void visitScalarAssignment(@NotNull RobotScalarAssignment o) {
    visitNamedElement(o);
    // visitScalarAssignmentStub>(o);
  }

  public void visitScalarAssignmentLhs(@NotNull RobotScalarAssignmentLhs o) {
    visitNamedElement(o);
  }

  public void visitScalarDefaultArgValue(@NotNull RobotScalarDefaultArgValue o) {
    visitNamedElement(o);
  }

  public void visitScalarVariable(@NotNull RobotScalarVariable o) {
    visitNamedElement(o);
    // visitScalarVariableStub>(o);
  }

  public void visitSetting(@NotNull RobotSetting o) {
    visitPsiElement(o);
  }

  public void visitSettingsLine(@NotNull RobotSettingsLine o) {
    visitPsiElement(o);
  }

  public void visitSettingsTable(@NotNull RobotSettingsTable o) {
    visitPsiElement(o);
  }

  public void visitSettingsTableHeading(@NotNull RobotSettingsTableHeading o) {
    visitPsiElement(o);
  }

  public void visitSettingList(@NotNull RobotSettingList o) {
    visitPsiElement(o);
  }

  public void visitSingleAssignmentLhs(@NotNull RobotSingleAssignmentLhs o) {
    visitPsiElement(o);
  }

  public void visitSingleBoundForLoop(@NotNull RobotSingleBoundForLoop o) {
    visitPsiElement(o);
  }

  public void visitSingleVariableList(@NotNull RobotSingleVariableList o) {
    visitPsiElement(o);
  }

  public void visitTable(@NotNull RobotTable o) {
    visitPsiElement(o);
  }

  public void visitTag(@NotNull RobotTag o) {
    visitPsiElement(o);
  }

  public void visitTagsMeta(@NotNull RobotTagsMeta o) {
    visitPsiElement(o);
  }

  public void visitTestcaseLine(@NotNull RobotTestcaseLine o) {
    visitPsiElement(o);
  }

  public void visitTestCase(@NotNull RobotTestCase o) {
    visitNamedElement(o);
    // visitTestCaseStub>(o);
  }

  public void visitTestCasesTable(@NotNull RobotTestCasesTable o) {
    visitPsiElement(o);
  }

  public void visitTestCasesTableHeading(@NotNull RobotTestCasesTableHeading o) {
    visitPsiElement(o);
  }

  public void visitTestCaseHeader(@NotNull RobotTestCaseHeader o) {
    visitPsiElement(o);
  }

  public void visitTestCaseSetupMeta(@NotNull RobotTestCaseSetupMeta o) {
    visitPsiElement(o);
  }

  public void visitTestCaseTeardownMeta(@NotNull RobotTestCaseTeardownMeta o) {
    visitPsiElement(o);
  }

  public void visitTestCaseTemplateMeta(@NotNull RobotTestCaseTemplateMeta o) {
    visitPsiElement(o);
  }

  public void visitTestCaseTimeoutMeta(@NotNull RobotTestCaseTimeoutMeta o) {
    visitPsiElement(o);
  }

  public void visitTestSetting(@NotNull RobotTestSetting o) {
    visitPsiElement(o);
  }

  public void visitTestSettingLine(@NotNull RobotTestSettingLine o) {
    visitPsiElement(o);
  }

  public void visitTestSetupSetting(@NotNull RobotTestSetupSetting o) {
    visitPsiElement(o);
  }

  public void visitTestSetupToken(@NotNull RobotTestSetupToken o) {
    visitPsiElement(o);
  }

  public void visitTestTemplateSetting(@NotNull RobotTestTemplateSetting o) {
    visitPsiElement(o);
  }

  public void visitTestTimeoutSetting(@NotNull RobotTestTimeoutSetting o) {
    visitPsiElement(o);
  }

  public void visitVariable(@NotNull RobotVariable o) {
    visitPsiElement(o);
  }

  public void visitVariablesLine(@NotNull RobotVariablesLine o) {
    visitPsiElement(o);
  }

  public void visitVariablesTable(@NotNull RobotVariablesTable o) {
    visitPsiElement(o);
  }

  public void visitVariablesTableHeading(@NotNull RobotVariablesTableHeading o) {
    visitPsiElement(o);
  }

  public void visitVariableAssignToKeyword(@NotNull RobotVariableAssignToKeyword o) {
    visitPsiElement(o);
  }

  public void visitVariableSetting(@NotNull RobotVariableSetting o) {
    visitPsiElement(o);
  }

  public void visitNamedElement(@NotNull RobotNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
