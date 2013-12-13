package ru.regenix.jphp.tokenizer.token.expr.operator;

import ru.regenix.jphp.tokenizer.token.stmt.ExprStmtToken;

public class DynamicAccessUnsetExprToken extends DynamicAccessExprToken {
    private ExprStmtToken value;

    public DynamicAccessUnsetExprToken(DynamicAccessExprToken token){
        super(token.getMeta());
        setField(token.getField());
        setFieldExpr(token.getFieldExpr());
    }

    public ExprStmtToken getValue() {
        return value;
    }

    public void setValue(ExprStmtToken value) {
        this.value = value;
    }
}
