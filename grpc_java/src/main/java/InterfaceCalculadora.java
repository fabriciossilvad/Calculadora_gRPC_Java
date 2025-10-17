public interface InterfaceCalculadora {

    default float soma(float x, float y) {
        float result = x + y;
        return result;
    }

    default float subtracao(float x, float y) {
        float result = x - y;
        return result;
    }

    default float multiplicacao(float x, float y) {
        float result = x * y;
        return result;
    }

    default float divisao(float x, float y) {
        float result = x / y;
        return result;
    }
}