package com.jivesoftware.robot.intellij.plugin.elements.structureview;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.structureView.TextEditorBasedStructureViewModel;
import com.intellij.psi.PsiFile;
import com.jivesoftware.robot.intellij.plugin.psi.RobotKeywordTitle;
import com.jivesoftware.robot.intellij.plugin.psi.RobotKeywordsTable;
import com.jivesoftware.robot.intellij.plugin.psi.RobotTestCase;
import com.jivesoftware.robot.intellij.plugin.psi.RobotTestCasesTable;
import org.jetbrains.annotations.NotNull;

/**
 * Created by charles on 6/5/14.
 */
public class RobotStructureViewModel extends TextEditorBasedStructureViewModel implements
        StructureViewModel.ElementInfoProvider {

    public RobotStructureViewModel(PsiFile psiFile) {
        super(psiFile);
    }

    @NotNull
    @Override
    public StructureViewTreeElement getRoot() {
        return new RobotStructureViewTreeElement(getPsiFile());
    }

    @Override
    @NotNull
    public Class[] getSuitableClasses() {
        return new Class[] {RobotTestCasesTable.class, RobotKeywordsTable.class, RobotKeywordTitle.class, RobotTestCase.class};
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return false;
    }
}
