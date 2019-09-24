package to.bnk.api.branch;

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
public final class BranchServiceGrpc {

  private BranchServiceGrpc() {}

  public static final String SERVICE_NAME = "branch.BranchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.branch.GetBranchRequest,
      to.bnk.api.branch.Branch> getGetBranchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBranch",
      requestType = to.bnk.api.branch.GetBranchRequest.class,
      responseType = to.bnk.api.branch.Branch.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.branch.GetBranchRequest,
      to.bnk.api.branch.Branch> getGetBranchMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.branch.GetBranchRequest, to.bnk.api.branch.Branch> getGetBranchMethod;
    if ((getGetBranchMethod = BranchServiceGrpc.getGetBranchMethod) == null) {
      synchronized (BranchServiceGrpc.class) {
        if ((getGetBranchMethod = BranchServiceGrpc.getGetBranchMethod) == null) {
          BranchServiceGrpc.getGetBranchMethod = getGetBranchMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.branch.GetBranchRequest, to.bnk.api.branch.Branch>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "branch.BranchService", "GetBranch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.branch.GetBranchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.branch.Branch.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetBranchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      to.bnk.api.branch.GetBranchesResponse> getGetBranchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBranches",
      requestType = com.google.protobuf.Empty.class,
      responseType = to.bnk.api.branch.GetBranchesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      to.bnk.api.branch.GetBranchesResponse> getGetBranchesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, to.bnk.api.branch.GetBranchesResponse> getGetBranchesMethod;
    if ((getGetBranchesMethod = BranchServiceGrpc.getGetBranchesMethod) == null) {
      synchronized (BranchServiceGrpc.class) {
        if ((getGetBranchesMethod = BranchServiceGrpc.getGetBranchesMethod) == null) {
          BranchServiceGrpc.getGetBranchesMethod = getGetBranchesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, to.bnk.api.branch.GetBranchesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "branch.BranchService", "GetBranches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.branch.GetBranchesResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getGetBranchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.branch.CreateBranchRequest,
      to.bnk.api.branch.CreateBranchResponse> getCreateBranchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBranch",
      requestType = to.bnk.api.branch.CreateBranchRequest.class,
      responseType = to.bnk.api.branch.CreateBranchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.branch.CreateBranchRequest,
      to.bnk.api.branch.CreateBranchResponse> getCreateBranchMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.branch.CreateBranchRequest, to.bnk.api.branch.CreateBranchResponse> getCreateBranchMethod;
    if ((getCreateBranchMethod = BranchServiceGrpc.getCreateBranchMethod) == null) {
      synchronized (BranchServiceGrpc.class) {
        if ((getCreateBranchMethod = BranchServiceGrpc.getCreateBranchMethod) == null) {
          BranchServiceGrpc.getCreateBranchMethod = getCreateBranchMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.branch.CreateBranchRequest, to.bnk.api.branch.CreateBranchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "branch.BranchService", "CreateBranch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.branch.CreateBranchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.branch.CreateBranchResponse.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getCreateBranchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.branch.UpdateBranchRequest,
      com.google.protobuf.Empty> getUpdateBranchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBranch",
      requestType = to.bnk.api.branch.UpdateBranchRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.branch.UpdateBranchRequest,
      com.google.protobuf.Empty> getUpdateBranchMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.branch.UpdateBranchRequest, com.google.protobuf.Empty> getUpdateBranchMethod;
    if ((getUpdateBranchMethod = BranchServiceGrpc.getUpdateBranchMethod) == null) {
      synchronized (BranchServiceGrpc.class) {
        if ((getUpdateBranchMethod = BranchServiceGrpc.getUpdateBranchMethod) == null) {
          BranchServiceGrpc.getUpdateBranchMethod = getUpdateBranchMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.branch.UpdateBranchRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "branch.BranchService", "UpdateBranch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.branch.UpdateBranchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getUpdateBranchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.branch.DeleteBranchRequest,
      com.google.protobuf.Empty> getDeleteBranchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBranch",
      requestType = to.bnk.api.branch.DeleteBranchRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.branch.DeleteBranchRequest,
      com.google.protobuf.Empty> getDeleteBranchMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.branch.DeleteBranchRequest, com.google.protobuf.Empty> getDeleteBranchMethod;
    if ((getDeleteBranchMethod = BranchServiceGrpc.getDeleteBranchMethod) == null) {
      synchronized (BranchServiceGrpc.class) {
        if ((getDeleteBranchMethod = BranchServiceGrpc.getDeleteBranchMethod) == null) {
          BranchServiceGrpc.getDeleteBranchMethod = getDeleteBranchMethod = 
              io.grpc.MethodDescriptor.<to.bnk.api.branch.DeleteBranchRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "branch.BranchService", "DeleteBranch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.branch.DeleteBranchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .build();
          }
        }
     }
     return getDeleteBranchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BranchServiceStub newStub(io.grpc.Channel channel) {
    return new BranchServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BranchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BranchServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BranchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BranchServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BranchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBranch(to.bnk.api.branch.GetBranchRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.branch.Branch> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBranchMethod(), responseObserver);
    }

    /**
     */
    public void getBranches(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<to.bnk.api.branch.GetBranchesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBranchesMethod(), responseObserver);
    }

    /**
     */
    public void createBranch(to.bnk.api.branch.CreateBranchRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.branch.CreateBranchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBranchMethod(), responseObserver);
    }

    /**
     */
    public void updateBranch(to.bnk.api.branch.UpdateBranchRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBranchMethod(), responseObserver);
    }

    /**
     */
    public void deleteBranch(to.bnk.api.branch.DeleteBranchRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBranchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBranchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.branch.GetBranchRequest,
                to.bnk.api.branch.Branch>(
                  this, METHODID_GET_BRANCH)))
          .addMethod(
            getGetBranchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                to.bnk.api.branch.GetBranchesResponse>(
                  this, METHODID_GET_BRANCHES)))
          .addMethod(
            getCreateBranchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.branch.CreateBranchRequest,
                to.bnk.api.branch.CreateBranchResponse>(
                  this, METHODID_CREATE_BRANCH)))
          .addMethod(
            getUpdateBranchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.branch.UpdateBranchRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_BRANCH)))
          .addMethod(
            getDeleteBranchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.branch.DeleteBranchRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BRANCH)))
          .build();
    }
  }

  /**
   */
  public static final class BranchServiceStub extends io.grpc.stub.AbstractStub<BranchServiceStub> {
    private BranchServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BranchServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BranchServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BranchServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBranch(to.bnk.api.branch.GetBranchRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.branch.Branch> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBranchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBranches(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<to.bnk.api.branch.GetBranchesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBranchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBranch(to.bnk.api.branch.CreateBranchRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.branch.CreateBranchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBranchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBranch(to.bnk.api.branch.UpdateBranchRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBranchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBranch(to.bnk.api.branch.DeleteBranchRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBranchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BranchServiceBlockingStub extends io.grpc.stub.AbstractStub<BranchServiceBlockingStub> {
    private BranchServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BranchServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BranchServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BranchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.branch.Branch getBranch(to.bnk.api.branch.GetBranchRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBranchMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.branch.GetBranchesResponse getBranches(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetBranchesMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.branch.CreateBranchResponse createBranch(to.bnk.api.branch.CreateBranchRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateBranchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateBranch(to.bnk.api.branch.UpdateBranchRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBranchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteBranch(to.bnk.api.branch.DeleteBranchRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBranchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BranchServiceFutureStub extends io.grpc.stub.AbstractStub<BranchServiceFutureStub> {
    private BranchServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BranchServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BranchServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BranchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.branch.Branch> getBranch(
        to.bnk.api.branch.GetBranchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBranchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.branch.GetBranchesResponse> getBranches(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBranchesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.branch.CreateBranchResponse> createBranch(
        to.bnk.api.branch.CreateBranchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBranchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateBranch(
        to.bnk.api.branch.UpdateBranchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBranchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBranch(
        to.bnk.api.branch.DeleteBranchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBranchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BRANCH = 0;
  private static final int METHODID_GET_BRANCHES = 1;
  private static final int METHODID_CREATE_BRANCH = 2;
  private static final int METHODID_UPDATE_BRANCH = 3;
  private static final int METHODID_DELETE_BRANCH = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BranchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BranchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BRANCH:
          serviceImpl.getBranch((to.bnk.api.branch.GetBranchRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.branch.Branch>) responseObserver);
          break;
        case METHODID_GET_BRANCHES:
          serviceImpl.getBranches((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.branch.GetBranchesResponse>) responseObserver);
          break;
        case METHODID_CREATE_BRANCH:
          serviceImpl.createBranch((to.bnk.api.branch.CreateBranchRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.branch.CreateBranchResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BRANCH:
          serviceImpl.updateBranch((to.bnk.api.branch.UpdateBranchRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_BRANCH:
          serviceImpl.deleteBranch((to.bnk.api.branch.DeleteBranchRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
      synchronized (BranchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetBranchMethod())
              .addMethod(getGetBranchesMethod())
              .addMethod(getCreateBranchMethod())
              .addMethod(getUpdateBranchMethod())
              .addMethod(getDeleteBranchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
