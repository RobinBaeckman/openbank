package to.bnk.api.transactions;

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
public final class TransactionServiceGrpc {

  private TransactionServiceGrpc() {}

  public static final String SERVICE_NAME = "transactions.TransactionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactions.GetTransactionRequest,
      to.bnk.api.transactions.Transaction> getGetTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransaction",
      requestType = to.bnk.api.transactions.GetTransactionRequest.class,
      responseType = to.bnk.api.transactions.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactions.GetTransactionRequest,
      to.bnk.api.transactions.Transaction> getGetTransactionMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactions.GetTransactionRequest, to.bnk.api.transactions.Transaction> getGetTransactionMethod;
    if ((getGetTransactionMethod = TransactionServiceGrpc.getGetTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getGetTransactionMethod = TransactionServiceGrpc.getGetTransactionMethod) == null) {
          TransactionServiceGrpc.getGetTransactionMethod = getGetTransactionMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.transactions.GetTransactionRequest, to.bnk.api.transactions.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transactions.TransactionService", "GetTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.GetTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.Transaction.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactions.GetTransactionsRequest,
      to.bnk.api.transactions.GetTransactionsResponse> getGetTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactions",
      requestType = to.bnk.api.transactions.GetTransactionsRequest.class,
      responseType = to.bnk.api.transactions.GetTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactions.GetTransactionsRequest,
      to.bnk.api.transactions.GetTransactionsResponse> getGetTransactionsMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactions.GetTransactionsRequest, to.bnk.api.transactions.GetTransactionsResponse> getGetTransactionsMethod;
    if ((getGetTransactionsMethod = TransactionServiceGrpc.getGetTransactionsMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getGetTransactionsMethod = TransactionServiceGrpc.getGetTransactionsMethod) == null) {
          TransactionServiceGrpc.getGetTransactionsMethod = getGetTransactionsMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.transactions.GetTransactionsRequest, to.bnk.api.transactions.GetTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transactions.TransactionService", "GetTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.GetTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.GetTransactionsResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactions.GetTransactionsByAccountRequest,
      to.bnk.api.transactions.GetTransactionsByAccountResponse> getGetTransactionsByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionsByAccount",
      requestType = to.bnk.api.transactions.GetTransactionsByAccountRequest.class,
      responseType = to.bnk.api.transactions.GetTransactionsByAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactions.GetTransactionsByAccountRequest,
      to.bnk.api.transactions.GetTransactionsByAccountResponse> getGetTransactionsByAccountMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactions.GetTransactionsByAccountRequest, to.bnk.api.transactions.GetTransactionsByAccountResponse> getGetTransactionsByAccountMethod;
    if ((getGetTransactionsByAccountMethod = TransactionServiceGrpc.getGetTransactionsByAccountMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getGetTransactionsByAccountMethod = TransactionServiceGrpc.getGetTransactionsByAccountMethod) == null) {
          TransactionServiceGrpc.getGetTransactionsByAccountMethod = getGetTransactionsByAccountMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.transactions.GetTransactionsByAccountRequest, to.bnk.api.transactions.GetTransactionsByAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transactions.TransactionService", "GetTransactionsByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.GetTransactionsByAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.GetTransactionsByAccountResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetTransactionsByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactions.CreateTransactionRequest,
      to.bnk.api.transactions.CreateTransactionResponse> getCreateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransaction",
      requestType = to.bnk.api.transactions.CreateTransactionRequest.class,
      responseType = to.bnk.api.transactions.CreateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactions.CreateTransactionRequest,
      to.bnk.api.transactions.CreateTransactionResponse> getCreateTransactionMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactions.CreateTransactionRequest, to.bnk.api.transactions.CreateTransactionResponse> getCreateTransactionMethod;
    if ((getCreateTransactionMethod = TransactionServiceGrpc.getCreateTransactionMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getCreateTransactionMethod = TransactionServiceGrpc.getCreateTransactionMethod) == null) {
          TransactionServiceGrpc.getCreateTransactionMethod = getCreateTransactionMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.transactions.CreateTransactionRequest, to.bnk.api.transactions.CreateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transactions.TransactionService", "CreateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.CreateTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.CreateTransactionResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getCreateTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactions.ApprovePaymentRequest,
      to.bnk.api.transactions.ApprovePaymentResponse> getApprovePaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApprovePayment",
      requestType = to.bnk.api.transactions.ApprovePaymentRequest.class,
      responseType = to.bnk.api.transactions.ApprovePaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactions.ApprovePaymentRequest,
      to.bnk.api.transactions.ApprovePaymentResponse> getApprovePaymentMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactions.ApprovePaymentRequest, to.bnk.api.transactions.ApprovePaymentResponse> getApprovePaymentMethod;
    if ((getApprovePaymentMethod = TransactionServiceGrpc.getApprovePaymentMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getApprovePaymentMethod = TransactionServiceGrpc.getApprovePaymentMethod) == null) {
          TransactionServiceGrpc.getApprovePaymentMethod = getApprovePaymentMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.transactions.ApprovePaymentRequest, to.bnk.api.transactions.ApprovePaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transactions.TransactionService", "ApprovePayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.ApprovePaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.ApprovePaymentResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getApprovePaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactions.TFARequest,
      to.bnk.api.transactions.TFAResponse> getTFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TFA",
      requestType = to.bnk.api.transactions.TFARequest.class,
      responseType = to.bnk.api.transactions.TFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactions.TFARequest,
      to.bnk.api.transactions.TFAResponse> getTFAMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactions.TFARequest, to.bnk.api.transactions.TFAResponse> getTFAMethod;
    if ((getTFAMethod = TransactionServiceGrpc.getTFAMethod) == null) {
      synchronized (TransactionServiceGrpc.class) {
        if ((getTFAMethod = TransactionServiceGrpc.getTFAMethod) == null) {
          TransactionServiceGrpc.getTFAMethod = getTFAMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.transactions.TFARequest, to.bnk.api.transactions.TFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "transactions.TransactionService", "TFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.TFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactions.TFAResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getTFAMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionServiceStub newStub(io.grpc.Channel channel) {
    return new TransactionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TransactionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TransactionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TransactionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTransaction(to.bnk.api.transactions.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getTransactions(to.bnk.api.transactions.GetTransactionsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.GetTransactionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionsMethod(), responseObserver);
    }

    /**
     */
    public void getTransactionsByAccount(to.bnk.api.transactions.GetTransactionsByAccountRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.GetTransactionsByAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionsByAccountMethod(), responseObserver);
    }

    /**
     */
    public void createTransaction(to.bnk.api.transactions.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.CreateTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTransactionMethod(), responseObserver);
    }

    /**
     */
    public void approvePayment(to.bnk.api.transactions.ApprovePaymentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.ApprovePaymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getApprovePaymentMethod(), responseObserver);
    }

    /**
     */
    public void tFA(to.bnk.api.transactions.TFARequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.TFAResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTFAMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactions.GetTransactionRequest,
                to.bnk.api.transactions.Transaction>(
                  this, METHODID_GET_TRANSACTION)))
          .addMethod(
            getGetTransactionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactions.GetTransactionsRequest,
                to.bnk.api.transactions.GetTransactionsResponse>(
                  this, METHODID_GET_TRANSACTIONS)))
          .addMethod(
            getGetTransactionsByAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactions.GetTransactionsByAccountRequest,
                to.bnk.api.transactions.GetTransactionsByAccountResponse>(
                  this, METHODID_GET_TRANSACTIONS_BY_ACCOUNT)))
          .addMethod(
            getCreateTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactions.CreateTransactionRequest,
                to.bnk.api.transactions.CreateTransactionResponse>(
                  this, METHODID_CREATE_TRANSACTION)))
          .addMethod(
            getApprovePaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactions.ApprovePaymentRequest,
                to.bnk.api.transactions.ApprovePaymentResponse>(
                  this, METHODID_APPROVE_PAYMENT)))
          .addMethod(
            getTFAMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactions.TFARequest,
                to.bnk.api.transactions.TFAResponse>(
                  this, METHODID_TFA)))
          .build();
    }
  }

  /**
   */
  public static final class TransactionServiceStub extends io.grpc.stub.AbstractStub<TransactionServiceStub> {
    private TransactionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTransaction(to.bnk.api.transactions.GetTransactionRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.Transaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactions(to.bnk.api.transactions.GetTransactionsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.GetTransactionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionsByAccount(to.bnk.api.transactions.GetTransactionsByAccountRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.GetTransactionsByAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionsByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTransaction(to.bnk.api.transactions.CreateTransactionRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.CreateTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void approvePayment(to.bnk.api.transactions.ApprovePaymentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.ApprovePaymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApprovePaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tFA(to.bnk.api.transactions.TFARequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactions.TFAResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTFAMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TransactionServiceBlockingStub extends io.grpc.stub.AbstractStub<TransactionServiceBlockingStub> {
    private TransactionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.transactions.Transaction getTransaction(to.bnk.api.transactions.GetTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactions.GetTransactionsResponse getTransactions(to.bnk.api.transactions.GetTransactionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactions.GetTransactionsByAccountResponse getTransactionsByAccount(to.bnk.api.transactions.GetTransactionsByAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionsByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactions.CreateTransactionResponse createTransaction(to.bnk.api.transactions.CreateTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactions.ApprovePaymentResponse approvePayment(to.bnk.api.transactions.ApprovePaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getApprovePaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactions.TFAResponse tFA(to.bnk.api.transactions.TFARequest request) {
      return blockingUnaryCall(
          getChannel(), getTFAMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TransactionServiceFutureStub extends io.grpc.stub.AbstractStub<TransactionServiceFutureStub> {
    private TransactionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactions.Transaction> getTransaction(
        to.bnk.api.transactions.GetTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactions.GetTransactionsResponse> getTransactions(
        to.bnk.api.transactions.GetTransactionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactions.GetTransactionsByAccountResponse> getTransactionsByAccount(
        to.bnk.api.transactions.GetTransactionsByAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionsByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactions.CreateTransactionResponse> createTransaction(
        to.bnk.api.transactions.CreateTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactions.ApprovePaymentResponse> approvePayment(
        to.bnk.api.transactions.ApprovePaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getApprovePaymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactions.TFAResponse> tFA(
        to.bnk.api.transactions.TFARequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTFAMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRANSACTION = 0;
  private static final int METHODID_GET_TRANSACTIONS = 1;
  private static final int METHODID_GET_TRANSACTIONS_BY_ACCOUNT = 2;
  private static final int METHODID_CREATE_TRANSACTION = 3;
  private static final int METHODID_APPROVE_PAYMENT = 4;
  private static final int METHODID_TFA = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransactionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransactionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((to.bnk.api.transactions.GetTransactionRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactions.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTIONS:
          serviceImpl.getTransactions((to.bnk.api.transactions.GetTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactions.GetTransactionsResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTIONS_BY_ACCOUNT:
          serviceImpl.getTransactionsByAccount((to.bnk.api.transactions.GetTransactionsByAccountRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactions.GetTransactionsByAccountResponse>) responseObserver);
          break;
        case METHODID_CREATE_TRANSACTION:
          serviceImpl.createTransaction((to.bnk.api.transactions.CreateTransactionRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactions.CreateTransactionResponse>) responseObserver);
          break;
        case METHODID_APPROVE_PAYMENT:
          serviceImpl.approvePayment((to.bnk.api.transactions.ApprovePaymentRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactions.ApprovePaymentResponse>) responseObserver);
          break;
        case METHODID_TFA:
          serviceImpl.tFA((to.bnk.api.transactions.TFARequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactions.TFAResponse>) responseObserver);
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
      synchronized (TransactionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetTransactionMethod())
              .addMethod(getGetTransactionsMethod())
              .addMethod(getGetTransactionsByAccountMethod())
              .addMethod(getCreateTransactionMethod())
              .addMethod(getApprovePaymentMethod())
              .addMethod(getTFAMethod())
              .build();
        }
      }
    }
    return result;
  }
}
