package to.bnk.api.card;

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
public final class CardServiceGrpc {

  private CardServiceGrpc() {}

  public static final String SERVICE_NAME = "card.CardService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.card.GetCardRequest,
      to.bnk.api.card.Card> getGetCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCard",
      requestType = to.bnk.api.card.GetCardRequest.class,
      responseType = to.bnk.api.card.Card.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.card.GetCardRequest,
      to.bnk.api.card.Card> getGetCardMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.card.GetCardRequest, to.bnk.api.card.Card> getGetCardMethod;
    if ((getGetCardMethod = CardServiceGrpc.getGetCardMethod) == null) {
      synchronized (CardServiceGrpc.class) {
        if ((getGetCardMethod = CardServiceGrpc.getGetCardMethod) == null) {
          CardServiceGrpc.getGetCardMethod = getGetCardMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.card.GetCardRequest, to.bnk.api.card.Card>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "card.CardService", "GetCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.card.GetCardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.card.Card.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.card.UpdateCardStatusRequest,
      to.bnk.api.card.Result> getUpdateCardStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCardStatus",
      requestType = to.bnk.api.card.UpdateCardStatusRequest.class,
      responseType = to.bnk.api.card.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.card.UpdateCardStatusRequest,
      to.bnk.api.card.Result> getUpdateCardStatusMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.card.UpdateCardStatusRequest, to.bnk.api.card.Result> getUpdateCardStatusMethod;
    if ((getUpdateCardStatusMethod = CardServiceGrpc.getUpdateCardStatusMethod) == null) {
      synchronized (CardServiceGrpc.class) {
        if ((getUpdateCardStatusMethod = CardServiceGrpc.getUpdateCardStatusMethod) == null) {
          CardServiceGrpc.getUpdateCardStatusMethod = getUpdateCardStatusMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.card.UpdateCardStatusRequest, to.bnk.api.card.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "card.CardService", "UpdateCardStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.card.UpdateCardStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.card.Result.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getUpdateCardStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.card.UpdateCardAccessStatusRequest,
      to.bnk.api.card.Result> getUpdateCardAccessStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCardAccessStatus",
      requestType = to.bnk.api.card.UpdateCardAccessStatusRequest.class,
      responseType = to.bnk.api.card.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.card.UpdateCardAccessStatusRequest,
      to.bnk.api.card.Result> getUpdateCardAccessStatusMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.card.UpdateCardAccessStatusRequest, to.bnk.api.card.Result> getUpdateCardAccessStatusMethod;
    if ((getUpdateCardAccessStatusMethod = CardServiceGrpc.getUpdateCardAccessStatusMethod) == null) {
      synchronized (CardServiceGrpc.class) {
        if ((getUpdateCardAccessStatusMethod = CardServiceGrpc.getUpdateCardAccessStatusMethod) == null) {
          CardServiceGrpc.getUpdateCardAccessStatusMethod = getUpdateCardAccessStatusMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.card.UpdateCardAccessStatusRequest, to.bnk.api.card.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "card.CardService", "UpdateCardAccessStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.card.UpdateCardAccessStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.card.Result.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getUpdateCardAccessStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CardServiceStub newStub(io.grpc.Channel channel) {
    return new CardServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CardServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CardServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CardServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CardServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CardServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCard(to.bnk.api.card.GetCardRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.card.Card> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCardMethod(), responseObserver);
    }

    /**
     */
    public void updateCardStatus(to.bnk.api.card.UpdateCardStatusRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.card.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCardStatusMethod(), responseObserver);
    }

    /**
     */
    public void updateCardAccessStatus(to.bnk.api.card.UpdateCardAccessStatusRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.card.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCardAccessStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.card.GetCardRequest,
                to.bnk.api.card.Card>(
                  this, METHODID_GET_CARD)))
          .addMethod(
            getUpdateCardStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.card.UpdateCardStatusRequest,
                to.bnk.api.card.Result>(
                  this, METHODID_UPDATE_CARD_STATUS)))
          .addMethod(
            getUpdateCardAccessStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.card.UpdateCardAccessStatusRequest,
                to.bnk.api.card.Result>(
                  this, METHODID_UPDATE_CARD_ACCESS_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class CardServiceStub extends io.grpc.stub.AbstractStub<CardServiceStub> {
    private CardServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CardServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CardServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CardServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCard(to.bnk.api.card.GetCardRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.card.Card> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCardStatus(to.bnk.api.card.UpdateCardStatusRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.card.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCardStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCardAccessStatus(to.bnk.api.card.UpdateCardAccessStatusRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.card.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCardAccessStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CardServiceBlockingStub extends io.grpc.stub.AbstractStub<CardServiceBlockingStub> {
    private CardServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CardServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CardServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CardServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.card.Card getCard(to.bnk.api.card.GetCardRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCardMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.card.Result updateCardStatus(to.bnk.api.card.UpdateCardStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCardStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.card.Result updateCardAccessStatus(to.bnk.api.card.UpdateCardAccessStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCardAccessStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CardServiceFutureStub extends io.grpc.stub.AbstractStub<CardServiceFutureStub> {
    private CardServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CardServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CardServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CardServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.card.Card> getCard(
        to.bnk.api.card.GetCardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.card.Result> updateCardStatus(
        to.bnk.api.card.UpdateCardStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCardStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.card.Result> updateCardAccessStatus(
        to.bnk.api.card.UpdateCardAccessStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCardAccessStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CARD = 0;
  private static final int METHODID_UPDATE_CARD_STATUS = 1;
  private static final int METHODID_UPDATE_CARD_ACCESS_STATUS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CardServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CardServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CARD:
          serviceImpl.getCard((to.bnk.api.card.GetCardRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.card.Card>) responseObserver);
          break;
        case METHODID_UPDATE_CARD_STATUS:
          serviceImpl.updateCardStatus((to.bnk.api.card.UpdateCardStatusRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.card.Result>) responseObserver);
          break;
        case METHODID_UPDATE_CARD_ACCESS_STATUS:
          serviceImpl.updateCardAccessStatus((to.bnk.api.card.UpdateCardAccessStatusRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.card.Result>) responseObserver);
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
      synchronized (CardServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetCardMethod())
              .addMethod(getUpdateCardStatusMethod())
              .addMethod(getUpdateCardAccessStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
