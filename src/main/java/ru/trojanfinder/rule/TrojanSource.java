package ru.trojanfinder.rule;

import ru.trojanfinder.Main;
import spoon.reflect.declaration.CtAnnotationType;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtEnum;
import spoon.reflect.declaration.CtInterface;
import spoon.reflect.declaration.CtRecord;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.CtScanner;

import java.lang.annotation.Annotation;

public class TrojanSource extends CtScanner {

    private final Main main;

    public TrojanSource(Main main) {
        this.main = main;
    }

    @Override
    public <A extends Annotation> void visitCtAnnotationType(CtAnnotationType<A> annotationType) {
        visitCtType(annotationType);
    }

    @Override
    public <T extends Enum<?>> void visitCtEnum(CtEnum<T> ctEnum) {
        visitCtType(ctEnum);
    }

    @Override
    public void visitCtRecord(CtRecord recordType) {
        visitCtType(recordType);
    }

    @Override
    public <T> void visitCtInterface(CtInterface<T> intrface) {
        visitCtType(intrface);
    }

    @Override
    public <T> void visitCtClass(CtClass<T> ctClass) {
        visitCtType(ctClass);
    }

    private void visitCtType(CtType<?> ctType) {
        String classSourceCode = ctType.getOriginalSourceFragment().getSourceCode();
        // code
        // main.addAnalyzerMessage("test message");
    }
}
