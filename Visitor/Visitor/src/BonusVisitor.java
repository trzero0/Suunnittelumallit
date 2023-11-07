public interface BonusVisitor {
    void visit(NormalState state);
    void visit(SuperState state);
}