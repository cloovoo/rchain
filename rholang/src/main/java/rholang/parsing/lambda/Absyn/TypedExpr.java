package rholang.parsing.lambda.Absyn; // Java Package generated by the BNF Converter.

public abstract class TypedExpr implements java.io.Serializable {
  public abstract <R,A> R accept(TypedExpr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(rholang.parsing.lambda.Absyn.ETyped p, A arg);

  }

}
