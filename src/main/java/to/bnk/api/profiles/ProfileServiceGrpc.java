package to.bnk.api.profiles;

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
public final class ProfileServiceGrpc {

  private ProfileServiceGrpc() {}

  public static final String SERVICE_NAME = "profiles.ProfileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.profiles.GetProfileRequest,
      to.bnk.api.profiles.GetProfileResponse> getGetProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProfile",
      requestType = to.bnk.api.profiles.GetProfileRequest.class,
      responseType = to.bnk.api.profiles.GetProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.profiles.GetProfileRequest,
      to.bnk.api.profiles.GetProfileResponse> getGetProfileMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.profiles.GetProfileRequest, to.bnk.api.profiles.GetProfileResponse> getGetProfileMethod;
    if ((getGetProfileMethod = ProfileServiceGrpc.getGetProfileMethod) == null) {
      synchronized (ProfileServiceGrpc.class) {
        if ((getGetProfileMethod = ProfileServiceGrpc.getGetProfileMethod) == null) {
          ProfileServiceGrpc.getGetProfileMethod = getGetProfileMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.profiles.GetProfileRequest, to.bnk.api.profiles.GetProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "profiles.ProfileService", "GetProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.profiles.GetProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.profiles.GetProfileResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.profiles.GetProfileCardsRequest,
      to.bnk.api.profiles.GetProfileCardsResponse> getGetProfileCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProfileCard",
      requestType = to.bnk.api.profiles.GetProfileCardsRequest.class,
      responseType = to.bnk.api.profiles.GetProfileCardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.profiles.GetProfileCardsRequest,
      to.bnk.api.profiles.GetProfileCardsResponse> getGetProfileCardMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.profiles.GetProfileCardsRequest, to.bnk.api.profiles.GetProfileCardsResponse> getGetProfileCardMethod;
    if ((getGetProfileCardMethod = ProfileServiceGrpc.getGetProfileCardMethod) == null) {
      synchronized (ProfileServiceGrpc.class) {
        if ((getGetProfileCardMethod = ProfileServiceGrpc.getGetProfileCardMethod) == null) {
          ProfileServiceGrpc.getGetProfileCardMethod = getGetProfileCardMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.profiles.GetProfileCardsRequest, to.bnk.api.profiles.GetProfileCardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "profiles.ProfileService", "GetProfileCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.profiles.GetProfileCardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.profiles.GetProfileCardsResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetProfileCardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProfileServiceStub newStub(io.grpc.Channel channel) {
    return new ProfileServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProfileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProfileServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProfileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProfileServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProfileServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProfile(to.bnk.api.profiles.GetProfileRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.profiles.GetProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProfileMethod(), responseObserver);
    }

    /**
     */
    public void getProfileCard(to.bnk.api.profiles.GetProfileCardsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.profiles.GetProfileCardsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProfileCardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.profiles.GetProfileRequest,
                to.bnk.api.profiles.GetProfileResponse>(
                  this, METHODID_GET_PROFILE)))
          .addMethod(
            getGetProfileCardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.profiles.GetProfileCardsRequest,
                to.bnk.api.profiles.GetProfileCardsResponse>(
                  this, METHODID_GET_PROFILE_CARD)))
          .build();
    }
  }

  /**
   */
  public static final class ProfileServiceStub extends io.grpc.stub.AbstractStub<ProfileServiceStub> {
    private ProfileServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfileServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfileServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProfile(to.bnk.api.profiles.GetProfileRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.profiles.GetProfileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProfileCard(to.bnk.api.profiles.GetProfileCardsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.profiles.GetProfileCardsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProfileCardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProfileServiceBlockingStub extends io.grpc.stub.AbstractStub<ProfileServiceBlockingStub> {
    private ProfileServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfileServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfileServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.profiles.GetProfileResponse getProfile(to.bnk.api.profiles.GetProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.profiles.GetProfileCardsResponse getProfileCard(to.bnk.api.profiles.GetProfileCardsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProfileCardMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProfileServiceFutureStub extends io.grpc.stub.AbstractStub<ProfileServiceFutureStub> {
    private ProfileServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfileServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfileServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.profiles.GetProfileResponse> getProfile(
        to.bnk.api.profiles.GetProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.profiles.GetProfileCardsResponse> getProfileCard(
        to.bnk.api.profiles.GetProfileCardsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProfileCardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROFILE = 0;
  private static final int METHODID_GET_PROFILE_CARD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProfileServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProfileServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROFILE:
          serviceImpl.getProfile((to.bnk.api.profiles.GetProfileRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.profiles.GetProfileResponse>) responseObserver);
          break;
        case METHODID_GET_PROFILE_CARD:
          serviceImpl.getProfileCard((to.bnk.api.profiles.GetProfileCardsRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.profiles.GetProfileCardsResponse>) responseObserver);
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
      synchronized (ProfileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetProfileMethod())
              .addMethod(getGetProfileCardMethod())
              .build();
        }
      }
    }
    return result;
  }
}
