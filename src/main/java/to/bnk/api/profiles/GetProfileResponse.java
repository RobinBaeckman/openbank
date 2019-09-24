// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.profiles;

/**
 * Protobuf type {@code profiles.GetProfileResponse}
 */
public  final class GetProfileResponse extends
    com.google.protobuf.GeneratedMessageLite<
        GetProfileResponse, GetProfileResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:profiles.GetProfileResponse)
    GetProfileResponseOrBuilder {
  private GetProfileResponse() {
    accounts_ = emptyProtobufList();
  }
  public static final int PROFILE_FIELD_NUMBER = 1;
  private to.bnk.api.types.Profile profile_;
  /**
   * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasProfile() {
    return profile_ != null;
  }
  /**
   * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.types.Profile getProfile() {
    return profile_ == null ? to.bnk.api.types.Profile.getDefaultInstance() : profile_;
  }
  /**
   * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setProfile(to.bnk.api.types.Profile value) {
    if (value == null) {
      throw new NullPointerException();
    }
    profile_ = value;
    
    }
  /**
   * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setProfile(
      to.bnk.api.types.Profile.Builder builderForValue) {
    profile_ = builderForValue.build();
    
  }
  /**
   * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeProfile(to.bnk.api.types.Profile value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (profile_ != null &&
        profile_ != to.bnk.api.types.Profile.getDefaultInstance()) {
      profile_ =
        to.bnk.api.types.Profile.newBuilder(profile_).mergeFrom(value).buildPartial();
    } else {
      profile_ = value;
    }
    
  }
  /**
   * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearProfile() {  profile_ = null;
    
  }

  public static final int ACCOUNTS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<to.bnk.api.accounts.Account> accounts_;
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.util.List<to.bnk.api.accounts.Account> getAccountsList() {
    return accounts_;
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  public java.util.List<? extends to.bnk.api.accounts.AccountOrBuilder> 
      getAccountsOrBuilderList() {
    return accounts_;
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public int getAccountsCount() {
    return accounts_.size();
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.accounts.Account getAccounts(int index) {
    return accounts_.get(index);
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  public to.bnk.api.accounts.AccountOrBuilder getAccountsOrBuilder(
      int index) {
    return accounts_.get(index);
  }
  private void ensureAccountsIsMutable() {
    if (!accounts_.isModifiable()) {
      accounts_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(accounts_);
     }
  }

  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAccounts(
      int index, to.bnk.api.accounts.Account value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureAccountsIsMutable();
    accounts_.set(index, value);
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAccounts(
      int index, to.bnk.api.accounts.Account.Builder builderForValue) {
    ensureAccountsIsMutable();
    accounts_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAccounts(to.bnk.api.accounts.Account value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureAccountsIsMutable();
    accounts_.add(value);
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAccounts(
      int index, to.bnk.api.accounts.Account value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureAccountsIsMutable();
    accounts_.add(index, value);
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAccounts(
      to.bnk.api.accounts.Account.Builder builderForValue) {
    ensureAccountsIsMutable();
    accounts_.add(builderForValue.build());
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAccounts(
      int index, to.bnk.api.accounts.Account.Builder builderForValue) {
    ensureAccountsIsMutable();
    accounts_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAllAccounts(
      java.lang.Iterable<? extends to.bnk.api.accounts.Account> values) {
    ensureAccountsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, accounts_);
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearAccounts() {
    accounts_ = emptyProtobufList();
  }
  /**
   * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void removeAccounts(int index) {
    ensureAccountsIsMutable();
    accounts_.remove(index);
  }

  public static to.bnk.api.profiles.GetProfileResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.profiles.GetProfileResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.profiles.GetProfileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.profiles.GetProfileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.profiles.GetProfileResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.profiles.GetProfileResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.profiles.GetProfileResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.profiles.GetProfileResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.profiles.GetProfileResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.profiles.GetProfileResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.profiles.GetProfileResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.profiles.GetProfileResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.profiles.GetProfileResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code profiles.GetProfileResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.profiles.GetProfileResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:profiles.GetProfileResponse)
      to.bnk.api.profiles.GetProfileResponseOrBuilder {
    // Construct using to.bnk.api.profiles.GetProfileResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasProfile() {
      return instance.hasProfile();
    }
    /**
     * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.types.Profile getProfile() {
      return instance.getProfile();
    }
    /**
     * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setProfile(to.bnk.api.types.Profile value) {
      copyOnWrite();
      instance.setProfile(value);
      return this;
      }
    /**
     * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setProfile(
        to.bnk.api.types.Profile.Builder builderForValue) {
      copyOnWrite();
      instance.setProfile(builderForValue);
      return this;
    }
    /**
     * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeProfile(to.bnk.api.types.Profile value) {
      copyOnWrite();
      instance.mergeProfile(value);
      return this;
    }
    /**
     * <code>.types.Profile Profile = 1[json_name = "profile", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearProfile() {  copyOnWrite();
      instance.clearProfile();
      return this;
    }

    /**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.util.List<to.bnk.api.accounts.Account> getAccountsList() {
      return java.util.Collections.unmodifiableList(
          instance.getAccountsList());
    }
    /**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public int getAccountsCount() {
      return instance.getAccountsCount();
    }/**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.accounts.Account getAccounts(int index) {
      return instance.getAccounts(index);
    }
    /**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAccounts(
        int index, to.bnk.api.accounts.Account value) {
      copyOnWrite();
      instance.setAccounts(index, value);
      return this;
    }
    /**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAccounts(
        int index, to.bnk.api.accounts.Account.Builder builderForValue) {
      copyOnWrite();
      instance.setAccounts(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAccounts(to.bnk.api.accounts.Account value) {
      copyOnWrite();
      instance.addAccounts(value);
      return this;
    }
    /**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAccounts(
        int index, to.bnk.api.accounts.Account value) {
      copyOnWrite();
      instance.addAccounts(index, value);
      return this;
    }
    /**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAccounts(
        to.bnk.api.accounts.Account.Builder builderForValue) {
      copyOnWrite();
      instance.addAccounts(builderForValue);
      return this;
    }
    /**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAccounts(
        int index, to.bnk.api.accounts.Account.Builder builderForValue) {
      copyOnWrite();
      instance.addAccounts(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAllAccounts(
        java.lang.Iterable<? extends to.bnk.api.accounts.Account> values) {
      copyOnWrite();
      instance.addAllAccounts(values);
      return this;
    }
    /**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearAccounts() {
      copyOnWrite();
      instance.clearAccounts();
      return this;
    }
    /**
     * <code>repeated .accounts.Account Accounts = 2[json_name = "accounts", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder removeAccounts(int index) {
      copyOnWrite();
      instance.removeAccounts(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:profiles.GetProfileResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.profiles.GetProfileResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "profile_",
            "accounts_",
            to.bnk.api.accounts.Account.class,
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.profiles.GetProfileResponse> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.profiles.GetProfileResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.profiles.GetProfileResponse>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:profiles.GetProfileResponse)
  private static final to.bnk.api.profiles.GetProfileResponse DEFAULT_INSTANCE;
  static {
    GetProfileResponse defaultInstance = new GetProfileResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetProfileResponse.class, defaultInstance);
  }

  public static to.bnk.api.profiles.GetProfileResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetProfileResponse> PARSER;

  public static com.google.protobuf.Parser<GetProfileResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

