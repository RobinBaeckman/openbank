package to.bnk.api.accounts;

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
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "accounts.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accounts.GetAccountRequest,
      to.bnk.api.accounts.Account> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = to.bnk.api.accounts.GetAccountRequest.class,
      responseType = to.bnk.api.accounts.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accounts.GetAccountRequest,
      to.bnk.api.accounts.Account> getGetAccountMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accounts.GetAccountRequest, to.bnk.api.accounts.Account> getGetAccountMethod;
    if ((getGetAccountMethod = AccountServiceGrpc.getGetAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetAccountMethod = AccountServiceGrpc.getGetAccountMethod) == null) {
          AccountServiceGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.accounts.GetAccountRequest, to.bnk.api.accounts.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "accounts.AccountService", "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.Account.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accounts.GetAccountsRequest,
      to.bnk.api.accounts.GetAccountsResponse> getGetAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccounts",
      requestType = to.bnk.api.accounts.GetAccountsRequest.class,
      responseType = to.bnk.api.accounts.GetAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accounts.GetAccountsRequest,
      to.bnk.api.accounts.GetAccountsResponse> getGetAccountsMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accounts.GetAccountsRequest, to.bnk.api.accounts.GetAccountsResponse> getGetAccountsMethod;
    if ((getGetAccountsMethod = AccountServiceGrpc.getGetAccountsMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetAccountsMethod = AccountServiceGrpc.getGetAccountsMethod) == null) {
          AccountServiceGrpc.getGetAccountsMethod = getGetAccountsMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.accounts.GetAccountsRequest, to.bnk.api.accounts.GetAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "accounts.AccountService", "GetAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.GetAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.GetAccountsResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accounts.CreateAccountRequest,
      to.bnk.api.accounts.CreateAccountResponse> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount",
      requestType = to.bnk.api.accounts.CreateAccountRequest.class,
      responseType = to.bnk.api.accounts.CreateAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accounts.CreateAccountRequest,
      to.bnk.api.accounts.CreateAccountResponse> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accounts.CreateAccountRequest, to.bnk.api.accounts.CreateAccountResponse> getCreateAccountMethod;
    if ((getCreateAccountMethod = AccountServiceGrpc.getCreateAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getCreateAccountMethod = AccountServiceGrpc.getCreateAccountMethod) == null) {
          AccountServiceGrpc.getCreateAccountMethod = getCreateAccountMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.accounts.CreateAccountRequest, to.bnk.api.accounts.CreateAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "accounts.AccountService", "CreateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.CreateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.CreateAccountResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accounts.UpdateAccountRequest,
      com.google.protobuf.Empty> getUpdateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccount",
      requestType = to.bnk.api.accounts.UpdateAccountRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accounts.UpdateAccountRequest,
      com.google.protobuf.Empty> getUpdateAccountMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accounts.UpdateAccountRequest, com.google.protobuf.Empty> getUpdateAccountMethod;
    if ((getUpdateAccountMethod = AccountServiceGrpc.getUpdateAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getUpdateAccountMethod = AccountServiceGrpc.getUpdateAccountMethod) == null) {
          AccountServiceGrpc.getUpdateAccountMethod = getUpdateAccountMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.accounts.UpdateAccountRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "accounts.AccountService", "UpdateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.UpdateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getUpdateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accounts.DeleteAccountRequest,
      com.google.protobuf.Empty> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccount",
      requestType = to.bnk.api.accounts.DeleteAccountRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accounts.DeleteAccountRequest,
      com.google.protobuf.Empty> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accounts.DeleteAccountRequest, com.google.protobuf.Empty> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = AccountServiceGrpc.getDeleteAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getDeleteAccountMethod = AccountServiceGrpc.getDeleteAccountMethod) == null) {
          AccountServiceGrpc.getDeleteAccountMethod = getDeleteAccountMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.accounts.DeleteAccountRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "accounts.AccountService", "DeleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.DeleteAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getDeleteAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accounts.GetAccountStatusRequest,
      to.bnk.api.accounts.GetAccountStatusResponse> getGetAccountStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountStatus",
      requestType = to.bnk.api.accounts.GetAccountStatusRequest.class,
      responseType = to.bnk.api.accounts.GetAccountStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accounts.GetAccountStatusRequest,
      to.bnk.api.accounts.GetAccountStatusResponse> getGetAccountStatusMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accounts.GetAccountStatusRequest, to.bnk.api.accounts.GetAccountStatusResponse> getGetAccountStatusMethod;
    if ((getGetAccountStatusMethod = AccountServiceGrpc.getGetAccountStatusMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetAccountStatusMethod = AccountServiceGrpc.getGetAccountStatusMethod) == null) {
          AccountServiceGrpc.getGetAccountStatusMethod = getGetAccountStatusMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.accounts.GetAccountStatusRequest, to.bnk.api.accounts.GetAccountStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "accounts.AccountService", "GetAccountStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.GetAccountStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.GetAccountStatusResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetAccountStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accounts.UpdateAccountStatusRequest,
      com.google.protobuf.Empty> getUpdateAccountStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccountStatus",
      requestType = to.bnk.api.accounts.UpdateAccountStatusRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accounts.UpdateAccountStatusRequest,
      com.google.protobuf.Empty> getUpdateAccountStatusMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accounts.UpdateAccountStatusRequest, com.google.protobuf.Empty> getUpdateAccountStatusMethod;
    if ((getUpdateAccountStatusMethod = AccountServiceGrpc.getUpdateAccountStatusMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getUpdateAccountStatusMethod = AccountServiceGrpc.getUpdateAccountStatusMethod) == null) {
          AccountServiceGrpc.getUpdateAccountStatusMethod = getUpdateAccountStatusMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.accounts.UpdateAccountStatusRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "accounts.AccountService", "UpdateAccountStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.UpdateAccountStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getUpdateAccountStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accounts.CheckAccountRequest,
      to.bnk.api.accounts.CheckAccountResponse> getCheckAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckAccount",
      requestType = to.bnk.api.accounts.CheckAccountRequest.class,
      responseType = to.bnk.api.accounts.CheckAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accounts.CheckAccountRequest,
      to.bnk.api.accounts.CheckAccountResponse> getCheckAccountMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accounts.CheckAccountRequest, to.bnk.api.accounts.CheckAccountResponse> getCheckAccountMethod;
    if ((getCheckAccountMethod = AccountServiceGrpc.getCheckAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getCheckAccountMethod = AccountServiceGrpc.getCheckAccountMethod) == null) {
          AccountServiceGrpc.getCheckAccountMethod = getCheckAccountMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.accounts.CheckAccountRequest, to.bnk.api.accounts.CheckAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "accounts.AccountService", "CheckAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.CheckAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accounts.CheckAccountResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getCheckAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    return new AccountServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AccountServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAccount(to.bnk.api.accounts.GetAccountRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accounts.Account> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAccounts(to.bnk.api.accounts.GetAccountsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accounts.GetAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountsMethod(), responseObserver);
    }

    /**
     */
    public void createAccount(to.bnk.api.accounts.CreateAccountRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accounts.CreateAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     */
    public void updateAccount(to.bnk.api.accounts.UpdateAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccountMethod(), responseObserver);
    }

    /**
     */
    public void deleteAccount(to.bnk.api.accounts.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAccountStatus(to.bnk.api.accounts.GetAccountStatusRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accounts.GetAccountStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountStatusMethod(), responseObserver);
    }

    /**
     */
    public void updateAccountStatus(to.bnk.api.accounts.UpdateAccountStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccountStatusMethod(), responseObserver);
    }

    /**
     */
    public void checkAccount(to.bnk.api.accounts.CheckAccountRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accounts.CheckAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckAccountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accounts.GetAccountRequest,
                to.bnk.api.accounts.Account>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accounts.GetAccountsRequest,
                to.bnk.api.accounts.GetAccountsResponse>(
                  this, METHODID_GET_ACCOUNTS)))
          .addMethod(
            getCreateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accounts.CreateAccountRequest,
                to.bnk.api.accounts.CreateAccountResponse>(
                  this, METHODID_CREATE_ACCOUNT)))
          .addMethod(
            getUpdateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accounts.UpdateAccountRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_ACCOUNT)))
          .addMethod(
            getDeleteAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accounts.DeleteAccountRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ACCOUNT)))
          .addMethod(
            getGetAccountStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accounts.GetAccountStatusRequest,
                to.bnk.api.accounts.GetAccountStatusResponse>(
                  this, METHODID_GET_ACCOUNT_STATUS)))
          .addMethod(
            getUpdateAccountStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accounts.UpdateAccountStatusRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_ACCOUNT_STATUS)))
          .addMethod(
            getCheckAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accounts.CheckAccountRequest,
                to.bnk.api.accounts.CheckAccountResponse>(
                  this, METHODID_CHECK_ACCOUNT)))
          .build();
    }
  }

  /**
   */
  public static final class AccountServiceStub extends io.grpc.stub.AbstractStub<AccountServiceStub> {
    private AccountServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAccount(to.bnk.api.accounts.GetAccountRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accounts.Account> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccounts(to.bnk.api.accounts.GetAccountsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accounts.GetAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAccount(to.bnk.api.accounts.CreateAccountRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accounts.CreateAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccount(to.bnk.api.accounts.UpdateAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccount(to.bnk.api.accounts.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountStatus(to.bnk.api.accounts.GetAccountStatusRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accounts.GetAccountStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccountStatus(to.bnk.api.accounts.UpdateAccountStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccountStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkAccount(to.bnk.api.accounts.CheckAccountRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accounts.CheckAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountServiceBlockingStub extends io.grpc.stub.AbstractStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.accounts.Account getAccount(to.bnk.api.accounts.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.accounts.GetAccountsResponse getAccounts(to.bnk.api.accounts.GetAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.accounts.CreateAccountResponse createAccount(to.bnk.api.accounts.CreateAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateAccount(to.bnk.api.accounts.UpdateAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteAccount(to.bnk.api.accounts.DeleteAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.accounts.GetAccountStatusResponse getAccountStatus(to.bnk.api.accounts.GetAccountStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateAccountStatus(to.bnk.api.accounts.UpdateAccountStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccountStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.accounts.CheckAccountResponse checkAccount(to.bnk.api.accounts.CheckAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountServiceFutureStub extends io.grpc.stub.AbstractStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.accounts.Account> getAccount(
        to.bnk.api.accounts.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.accounts.GetAccountsResponse> getAccounts(
        to.bnk.api.accounts.GetAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.accounts.CreateAccountResponse> createAccount(
        to.bnk.api.accounts.CreateAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateAccount(
        to.bnk.api.accounts.UpdateAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAccount(
        to.bnk.api.accounts.DeleteAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.accounts.GetAccountStatusResponse> getAccountStatus(
        to.bnk.api.accounts.GetAccountStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateAccountStatus(
        to.bnk.api.accounts.UpdateAccountStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccountStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.accounts.CheckAccountResponse> checkAccount(
        to.bnk.api.accounts.CheckAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNT = 0;
  private static final int METHODID_GET_ACCOUNTS = 1;
  private static final int METHODID_CREATE_ACCOUNT = 2;
  private static final int METHODID_UPDATE_ACCOUNT = 3;
  private static final int METHODID_DELETE_ACCOUNT = 4;
  private static final int METHODID_GET_ACCOUNT_STATUS = 5;
  private static final int METHODID_UPDATE_ACCOUNT_STATUS = 6;
  private static final int METHODID_CHECK_ACCOUNT = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((to.bnk.api.accounts.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.accounts.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNTS:
          serviceImpl.getAccounts((to.bnk.api.accounts.GetAccountsRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.accounts.GetAccountsResponse>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((to.bnk.api.accounts.CreateAccountRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.accounts.CreateAccountResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT:
          serviceImpl.updateAccount((to.bnk.api.accounts.UpdateAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((to.bnk.api.accounts.DeleteAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_STATUS:
          serviceImpl.getAccountStatus((to.bnk.api.accounts.GetAccountStatusRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.accounts.GetAccountStatusResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT_STATUS:
          serviceImpl.updateAccountStatus((to.bnk.api.accounts.UpdateAccountStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CHECK_ACCOUNT:
          serviceImpl.checkAccount((to.bnk.api.accounts.CheckAccountRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.accounts.CheckAccountResponse>) responseObserver);
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
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountsMethod())
              .addMethod(getCreateAccountMethod())
              .addMethod(getUpdateAccountMethod())
              .addMethod(getDeleteAccountMethod())
              .addMethod(getGetAccountStatusMethod())
              .addMethod(getUpdateAccountStatusMethod())
              .addMethod(getCheckAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
