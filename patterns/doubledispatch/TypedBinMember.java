// patterns/doubledispatch/TypedBinMember.java
// An interface for adding the double dispatching
// method to the trash hierarchy without
// modifying the original hierarchy.
package patterns.doubledispatch;
import java.util.*;

interface TypedBinMember {
  // The new method:
  boolean addToBin(List<TypedBin> bins);
}