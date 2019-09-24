package to.bnk.api.auth;

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
public final class AuthorizationServiceGrpc {

  private AuthorizationServiceGrpc() {}

  public static final String SERVICE_NAME = "auth.AuthorizationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.auth.GetAuthorizationCodeRequest,
      to.bnk.api.auth.Empty> getGetAuthorizationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthorizationCode",
      requestType = to.bnk.api.auth.GetAuthorizationCodeRequest.class,
      responseType = to.bnk.api.auth.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.auth.GetAuthorizationCodeRequest,
      to.bnk.api.auth.Empty> getGetAuthorizationCodeMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.auth.GetAuthorizationCodeRequest, to.bnk.api.auth.Empty> getGetAuthorizationCodeMethod;
    if ((getGetAuthorizationCodeMethod = AuthorizationServiceGrpc.getGetAuthorizationCodeMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getGetAuthorizationCodeMethod = AuthorizationServiceGrpc.getGetAuthorizationCodeMethod) == null) {
          AuthorizationServiceGrpc.getGetAuthorizationCodeMethod = getGetAuthorizationCodeMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.auth.GetAuthorizationCodeRequest, to.bnk.api.auth.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.AuthorizationService", "GetAuthorizationCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.auth.GetAuthorizationCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.auth.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetAuthorizationCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.auth.CreateAccessTokenRequest,
      to.bnk.api.auth.CreateAccessTokenResponse> getCreateAccessTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccessToken",
      requestType = to.bnk.api.auth.CreateAccessTokenRequest.class,
      responseType = to.bnk.api.auth.CreateAccessTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.auth.CreateAccessTokenRequest,
      to.bnk.api.auth.CreateAccessTokenResponse> getCreateAccessTokenMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.auth.CreateAccessTokenRequest, to.bnk.api.auth.CreateAccessTokenResponse> getCreateAccessTokenMethod;
    if ((getCreateAccessTokenMethod = AuthorizationServiceGrpc.getCreateAccessTokenMethod) == null) {
      synchronized (AuthorizationServiceGrpc.class) {
        if ((getCreateAccessTokenMethod = AuthorizationServiceGrpc.getCreateAccessTokenMethod) == null) {
          AuthorizationServiceGrpc.getCreateAccessTokenMethod = getCreateAccessTokenMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.auth.CreateAccessTokenRequest, to.bnk.api.auth.CreateAccessTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "auth.AuthorizationService", "CreateAccessToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.auth.CreateAccessTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.auth.CreateAccessTokenResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getCreateAccessTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthorizationServiceStub newStub(io.grpc.Channel channel) {
    return new AuthorizationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthorizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthorizationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthorizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthorizationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthorizationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAuthorizationCode(to.bnk.api.auth.GetAuthorizationCodeRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.auth.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuthorizationCodeMethod(), responseObserver);
    }

    /**
     */
    public void createAccessToken(to.bnk.api.auth.CreateAccessTokenRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.auth.CreateAccessTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccessTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAuthorizationCodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.auth.GetAuthorizationCodeRequest,
                to.bnk.api.auth.Empty>(
                  this, METHODID_GET_AUTHORIZATION_CODE)))
          .addMethod(
            getCreateAccessTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.auth.CreateAccessTokenRequest,
                to.bnk.api.auth.CreateAccessTokenResponse>(
                  this, METHODID_CREATE_ACCESS_TOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class AuthorizationServiceStub extends io.grpc.stub.AbstractStub<AuthorizationServiceStub> {
    private AuthorizationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAuthorizationCode(to.bnk.api.auth.GetAuthorizationCodeRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.auth.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAuthorizationCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAccessToken(to.bnk.api.auth.CreateAccessTokenRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.auth.CreateAccessTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAccessTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthorizationServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthorizationServiceBlockingStub> {
    private AuthorizationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.auth.Empty getAuthorizationCode(to.bnk.api.auth.GetAuthorizationCodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAuthorizationCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.auth.CreateAccessTokenResponse createAccessToken(to.bnk.api.auth.CreateAccessTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAccessTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthorizationServiceFutureStub extends io.grpc.stub.AbstractStub<AuthorizationServiceFutureStub> {
    private AuthorizationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthorizationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthorizationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.auth.Empty> getAuthorizationCode(
        to.bnk.api.auth.GetAuthorizationCodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAuthorizationCodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.auth.CreateAccessTokenResponse> createAccessToken(
        to.bnk.api.auth.CreateAccessTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAccessTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AUTHORIZATION_CODE = 0;
  private static final int METHODID_CREATE_ACCESS_TOKEN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthorizationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthorizationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AUTHORIZATION_CODE:
          serviceImpl.getAuthorizationCode((to.bnk.api.auth.GetAuthorizationCodeRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.auth.Empty>) responseObserver);
          break;
        case METHODID_CREATE_ACCESS_TOKEN:
          serviceImpl.createAccessToken((to.bnk.api.auth.CreateAccessTokenRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.auth.CreateAccessTokenResponse>) responseObserver);
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
      synchronized (AuthorizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetAuthorizationCodeMethod())
              .addMethod(getCreateAccessTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
