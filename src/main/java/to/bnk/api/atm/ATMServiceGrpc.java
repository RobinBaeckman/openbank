package to.bnk.api.atm;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: all.proto")
public final class ATMServiceGrpc {

  private ATMServiceGrpc() {}

  public static final String SERVICE_NAME = "atm.ATMService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.atm.GetATMRequest,
      to.bnk.api.atm.ATM> getGetATMMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetATM",
      requestType = to.bnk.api.atm.GetATMRequest.class,
      responseType = to.bnk.api.atm.ATM.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.atm.GetATMRequest,
      to.bnk.api.atm.ATM> getGetATMMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.atm.GetATMRequest, to.bnk.api.atm.ATM> getGetATMMethod;
    if ((getGetATMMethod = ATMServiceGrpc.getGetATMMethod) == null) {
      synchronized (ATMServiceGrpc.class) {
        if ((getGetATMMethod = ATMServiceGrpc.getGetATMMethod) == null) {
          ATMServiceGrpc.getGetATMMethod = getGetATMMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.atm.GetATMRequest, to.bnk.api.atm.ATM>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "atm.ATMService", "GetATM"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.atm.GetATMRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.atm.ATM.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetATMMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      to.bnk.api.atm.GetATMsResponse> getGetATMsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetATMs",
      requestType = com.google.protobuf.Empty.class,
      responseType = to.bnk.api.atm.GetATMsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      to.bnk.api.atm.GetATMsResponse> getGetATMsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, to.bnk.api.atm.GetATMsResponse> getGetATMsMethod;
    if ((getGetATMsMethod = ATMServiceGrpc.getGetATMsMethod) == null) {
      synchronized (ATMServiceGrpc.class) {
        if ((getGetATMsMethod = ATMServiceGrpc.getGetATMsMethod) == null) {
          ATMServiceGrpc.getGetATMsMethod = getGetATMsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, to.bnk.api.atm.GetATMsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "atm.ATMService", "GetATMs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.atm.GetATMsResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetATMsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.atm.CreateATMRequest,
      to.bnk.api.atm.CreateATMResponse> getCreateATMMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateATM",
      requestType = to.bnk.api.atm.CreateATMRequest.class,
      responseType = to.bnk.api.atm.CreateATMResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.atm.CreateATMRequest,
      to.bnk.api.atm.CreateATMResponse> getCreateATMMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.atm.CreateATMRequest, to.bnk.api.atm.CreateATMResponse> getCreateATMMethod;
    if ((getCreateATMMethod = ATMServiceGrpc.getCreateATMMethod) == null) {
      synchronized (ATMServiceGrpc.class) {
        if ((getCreateATMMethod = ATMServiceGrpc.getCreateATMMethod) == null) {
          ATMServiceGrpc.getCreateATMMethod = getCreateATMMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.atm.CreateATMRequest, to.bnk.api.atm.CreateATMResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "atm.ATMService", "CreateATM"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.atm.CreateATMRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.atm.CreateATMResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getCreateATMMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ATMServiceStub newStub(io.grpc.Channel channel) {
    return new ATMServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ATMServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ATMServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ATMServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ATMServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ATMServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getATM(to.bnk.api.atm.GetATMRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.atm.ATM> responseObserver) {
      asyncUnimplementedUnaryCall(getGetATMMethod(), responseObserver);
    }

    /**
     */
    public void getATMs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<to.bnk.api.atm.GetATMsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetATMsMethod(), responseObserver);
    }

    /**
     */
    public void createATM(to.bnk.api.atm.CreateATMRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.atm.CreateATMResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateATMMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetATMMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.atm.GetATMRequest,
                to.bnk.api.atm.ATM>(
                  this, METHODID_GET_ATM)))
          .addMethod(
            getGetATMsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                to.bnk.api.atm.GetATMsResponse>(
                  this, METHODID_GET_ATMS)))
          .addMethod(
            getCreateATMMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.atm.CreateATMRequest,
                to.bnk.api.atm.CreateATMResponse>(
                  this, METHODID_CREATE_ATM)))
          .build();
    }
  }

  /**
   */
  public static final class ATMServiceStub extends io.grpc.stub.AbstractStub<ATMServiceStub> {
    private ATMServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ATMServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ATMServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ATMServiceStub(channel, callOptions);
    }

    /**
     */
    public void getATM(to.bnk.api.atm.GetATMRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.atm.ATM> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetATMMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getATMs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<to.bnk.api.atm.GetATMsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetATMsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createATM(to.bnk.api.atm.CreateATMRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.atm.CreateATMResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateATMMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ATMServiceBlockingStub extends io.grpc.stub.AbstractStub<ATMServiceBlockingStub> {
    private ATMServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ATMServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ATMServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ATMServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.atm.ATM getATM(to.bnk.api.atm.GetATMRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetATMMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.atm.GetATMsResponse getATMs(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetATMsMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.atm.CreateATMResponse createATM(to.bnk.api.atm.CreateATMRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateATMMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ATMServiceFutureStub extends io.grpc.stub.AbstractStub<ATMServiceFutureStub> {
    private ATMServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ATMServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ATMServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ATMServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.atm.ATM> getATM(
        to.bnk.api.atm.GetATMRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetATMMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.atm.GetATMsResponse> getATMs(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetATMsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.atm.CreateATMResponse> createATM(
        to.bnk.api.atm.CreateATMRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateATMMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ATM = 0;
  private static final int METHODID_GET_ATMS = 1;
  private static final int METHODID_CREATE_ATM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ATMServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ATMServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ATM:
          serviceImpl.getATM((to.bnk.api.atm.GetATMRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.atm.ATM>) responseObserver);
          break;
        case METHODID_GET_ATMS:
          serviceImpl.getATMs((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.atm.GetATMsResponse>) responseObserver);
          break;
        case METHODID_CREATE_ATM:
          serviceImpl.createATM((to.bnk.api.atm.CreateATMRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.atm.CreateATMResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ATMServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetATMMethod())
              .addMethod(getGetATMsMethod())
              .addMethod(getCreateATMMethod())
              .build();
        }
      }
    }
    return result;
  }
}
