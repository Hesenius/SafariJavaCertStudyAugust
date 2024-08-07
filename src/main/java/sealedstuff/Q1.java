package sealedstuff;

interface ArbInter {}
final class Y implements X {}
sealed interface X /*permits Y*/ /* point x */ {}
// line n1

/*
Which is/are true?
A) the code compiles as it stands
B) the code compiles if the following is added at point x
    permits Y, Z
AND this is added at line n1
class Z implements X {}
C) the code compiles if the following is added at point x
    permits Y, Z
AND this is added at line n1
record Z() implements X {}
D) the code compiles if this is added at line n1
enum Z implements X {}
E) the code compiles if the following is added at point x
permits Y extends ArbInter
F) the code compiles if the following is added at point x
permits Y
AND this is added at line n1
final class Z implements X {}
G) the code compiles if the following is added at line n1
non-sealed abstract class Z implements X permits Q {}
final class Q extends Z {}
public class Q1 {
*/

