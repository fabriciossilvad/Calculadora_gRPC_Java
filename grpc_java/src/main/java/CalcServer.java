import calc.sd.grpcteste.FloatReq;
import calc.sd.grpcteste.FloatRes;
import calc.sd.grpcteste.CalcDisGrpc.CalcDisImplBase;
import io.grpc.stub.StreamObserver;

public class CalcServer extends CalcDisImplBase implements InterfaceCalculadora {

    @Override
    public void soma(FloatReq request, StreamObserver<FloatRes> responObserver) {
        float result = soma(request.getNum1(), request.getNum2());
        FloatRes response = FloatRes.newBuilder().setResult(result).build();
        responObserver.onNext(response);
        responObserver.onCompleted();
    }

    @Override
    public void sub(FloatReq request, StreamObserver<FloatRes> responObserver) {
        float result = subtracao(request.getNum1(), request.getNum2());
        FloatRes response = FloatRes.newBuilder().setResult(result).build();
        responObserver.onNext(response);
        responObserver.onCompleted();
    }

    @Override
    public void mult(FloatReq request, StreamObserver<FloatRes> responObserver) {
        float result = multiplicacao(request.getNum1(), request.getNum2());
        FloatRes response = FloatRes.newBuilder().setResult(result).build();
        responObserver.onNext(response);
        responObserver.onCompleted();
    }

    @Override
    public void div(FloatReq request, StreamObserver<FloatRes> responObserver) {
        float result = divisao(request.getNum1(), request.getNum2());
        FloatRes response = FloatRes.newBuilder().setResult(result).build();
        responObserver.onNext(response);
        responObserver.onCompleted();
    }
}
