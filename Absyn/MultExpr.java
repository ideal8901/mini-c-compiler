package Absyn;

import java.util.*;
import java.io.PrintWriter;

public class MultExpr extends BinaryExpr {
    public MultExpr(Expr le, Expr re, Pos s, Pos e){
        super(le,re,s,e);
        symbol = "*";
    }

    public MultExpr checkSemantic(){
        this.expr_check();
        this.tn = TypeName.INT;
        return this;
    }
}
