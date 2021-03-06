// This is a generated file. Not intended for manual editing.
package com.jivesoftware.robot.intellij.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.jivesoftware.robot.intellij.plugin.parser.RobotTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.jivesoftware.robot.intellij.plugin.psi.*;
import com.jivesoftware.robot.intellij.plugin.elements.RobotImplUtil;

public class RobotTestSettingImpl extends ASTWrapperPsiElement implements RobotTestSetting {

  public RobotTestSettingImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotVisitor) ((RobotVisitor)visitor).visitTestSetting(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RobotDocumentationMeta getDocumentationMeta() {
    return findChildByClass(RobotDocumentationMeta.class);
  }

  @Override
  @Nullable
  public RobotTagsMeta getTagsMeta() {
    return findChildByClass(RobotTagsMeta.class);
  }

  @Override
  @Nullable
  public RobotTestCaseSetupMeta getTestCaseSetupMeta() {
    return findChildByClass(RobotTestCaseSetupMeta.class);
  }

  @Override
  @Nullable
  public RobotTestCaseTeardownMeta getTestCaseTeardownMeta() {
    return findChildByClass(RobotTestCaseTeardownMeta.class);
  }

  @Override
  @Nullable
  public RobotTestCaseTemplateMeta getTestCaseTemplateMeta() {
    return findChildByClass(RobotTestCaseTemplateMeta.class);
  }

  @Override
  @Nullable
  public RobotTestCaseTimeoutMeta getTestCaseTimeoutMeta() {
    return findChildByClass(RobotTestCaseTimeoutMeta.class);
  }

}
