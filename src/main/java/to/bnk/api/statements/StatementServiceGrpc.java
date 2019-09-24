package to.bnk.api.statements;

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
public final class StatementServiceGrpc {

  private StatementServiceGrpc() {}

  public static final String SERVICE_NAME = "statements.StatementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.statements.GetStatementRequest,
      to.bnk.api.statements.Statement> getGetStatementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatement",
      requestType = to.bnk.api.statements.GetStatementRequest.class,
      responseType = to.bnk.api.statements.Statement.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.statements.GetStatementRequest,
      to.bnk.api.statements.Statement> getGetStatementMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.statements.GetStatementRequest, to.bnk.api.statements.Statement> getGetStatementMethod;
    if ((getGetStatementMethod = StatementServiceGrpc.getGetStatementMethod) == null) {
      synchronized (StatementServiceGrpc.class) {
        if ((getGetStatementMethod = StatementServiceGrpc.getGetStatementMethod) == null) {
          StatementServiceGrpc.getGetStatementMethod = getGetStatementMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.statements.GetStatementRequest, to.bnk.api.statements.Statement>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "statements.StatementService", "GetStatement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.statements.GetStatementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.statements.Statement.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetStatementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.statements.GetStatementsRequest,
      to.bnk.api.statements.GetStatementsResponse> getGetStatementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatements",
      requestType = to.bnk.api.statements.GetStatementsRequest.class,
      responseType = to.bnk.api.statements.GetStatementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.statements.GetStatementsRequest,
      to.bnk.api.statements.GetStatementsResponse> getGetStatementsMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.statements.GetStatementsRequest, to.bnk.api.statements.GetStatementsResponse> getGetStatementsMethod;
    if ((getGetStatementsMethod = StatementServiceGrpc.getGetStatementsMethod) == null) {
      synchronized (StatementServiceGrpc.class) {
        if ((getGetStatementsMethod = StatementServiceGrpc.getGetStatementsMethod) == null) {
          StatementServiceGrpc.getGetStatementsMethod = getGetStatementsMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.statements.GetStatementsRequest, to.bnk.api.statements.GetStatementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "statements.StatementService", "GetStatements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.statements.GetStatementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.statements.GetStatementsResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetStatementsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StatementServiceStub newStub(io.grpc.Channel channel) {
    return new StatementServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StatementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StatementServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StatementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StatementServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StatementServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStatement(to.bnk.api.statements.GetStatementRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.statements.Statement> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatementMethod(), responseObserver);
    }

    /**
     */
    public void getStatements(to.bnk.api.statements.GetStatementsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.statements.GetStatementsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatementsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.statements.GetStatementRequest,
                to.bnk.api.statements.Statement>(
                  this, METHODID_GET_STATEMENT)))
          .addMethod(
            getGetStatementsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.statements.GetStatementsRequest,
                to.bnk.api.statements.GetStatementsResponse>(
                  this, METHODID_GET_STATEMENTS)))
          .build();
    }
  }

  /**
   */
  public static final class StatementServiceStub extends io.grpc.stub.AbstractStub<StatementServiceStub> {
    private StatementServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StatementServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatementServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StatementServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStatement(to.bnk.api.statements.GetStatementRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.statements.Statement> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStatements(to.bnk.api.statements.GetStatementsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.statements.GetStatementsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatementsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StatementServiceBlockingStub extends io.grpc.stub.AbstractStub<StatementServiceBlockingStub> {
    private StatementServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StatementServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatementServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StatementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.statements.Statement getStatement(to.bnk.api.statements.GetStatementRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatementMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.statements.GetStatementsResponse getStatements(to.bnk.api.statements.GetStatementsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatementsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StatementServiceFutureStub extends io.grpc.stub.AbstractStub<StatementServiceFutureStub> {
    private StatementServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StatementServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatementServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StatementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.statements.Statement> getStatement(
        to.bnk.api.statements.GetStatementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.statements.GetStatementsResponse> getStatements(
        to.bnk.api.statements.GetStatementsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatementsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATEMENT = 0;
  private static final int METHODID_GET_STATEMENTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StatementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StatementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATEMENT:
          serviceImpl.getStatement((to.bnk.api.statements.GetStatementRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.statements.Statement>) responseObserver);
          break;
        case METHODID_GET_STATEMENTS:
          serviceImpl.getStatements((to.bnk.api.statements.GetStatementsRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.statements.GetStatementsResponse>) responseObserver);
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
      synchronized (StatementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetStatementMethod())
              .addMethod(getGetStatementsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
