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
import com.intellij.psi.PsiReference;

public class RobotScalarVariableImpl extends ASTWrapperPsiElement implements RobotScalarVariable {

  public RobotScalarVariableImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotVisitor) ((RobotVisitor)visitor).visitScalarVariable(this);
    else super.accept(visitor);
  }

  @Nullable
  public PsiReference getReference() {
    return RobotImplUtil.getReference(this);
  }

  @NotNull
  public PsiReference[] getReferences() {
    return RobotImplUtil.getReferences(this);
  }

}