package by.it.prymshyts.matlab;

interface IMulOperation {
    Variable mul(FloatVariable firstVar, FloatVariable secondVar);      // Double * Double
    Variable mul(FloatVariable firstVar, VectorVariable secondVar);     // Double * Double[]
    Variable mul(FloatVariable firstVar, MatrixVariable secondVar);     // Double * Double[][]

    Variable mul(VectorVariable firstVar, FloatVariable secondVar);     // Double[] * Double

    Variable mul(MatrixVariable firstVar, FloatVariable secondVar);     // Double[][] * Double
    Variable mul(MatrixVariable firstVar, VectorVariable secondVar);    // Double[][] * Double[]
    Variable mul(MatrixVariable firstVar, MatrixVariable secondVar);    // Double[][] * Double[][]
}
