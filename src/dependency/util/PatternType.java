package dependency.util;

public enum PatternType {
    TYPEZERO,  // Long chain, special case of TypeOne
    TYPEONE,   // Relative start, Relative end
    TYPETWO,   // Relative start, Absolute end
    TYPETHREE, // Absolute start, Relative end
    TYPEFOUR,  // Absolute start, Absolute end
    TYPEFIVE,  // Relative + Relative with gap 1
    NOTYPE
}