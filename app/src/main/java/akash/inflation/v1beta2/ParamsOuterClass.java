// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/inflation/v1beta2/params.proto

package akash.inflation.v1beta2;

public final class ParamsOuterClass {
  private ParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:akash.inflation.v1beta2.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * InflationDecayFactor is the number of years it takes inflation to halve.
     * </pre>
     *
     * <code>uint32 inflation_decay_factor = 1 [(.gogoproto.customname) = "InflationDecayFactor", (.gogoproto.jsontag) = "inflation_decay_factor", (.gogoproto.moretags) = "yaml:&#92;"inflation_decay_factor&#92;""];</code>
     * @return The inflationDecayFactor.
     */
    int getInflationDecayFactor();

    /**
     * <pre>
     * InitialInflation is the rate at which inflation starts at genesis.
     * It is a decimal value in the range [0.0, 100.0].
     * </pre>
     *
     * <code>string initial_inflation = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "InitialInflation", (.gogoproto.jsontag) = "initial_inflation", (.gogoproto.moretags) = "yaml:&#92;"initial_inflation&#92;""];</code>
     * @return The initialInflation.
     */
    java.lang.String getInitialInflation();
    /**
     * <pre>
     * InitialInflation is the rate at which inflation starts at genesis.
     * It is a decimal value in the range [0.0, 100.0].
     * </pre>
     *
     * <code>string initial_inflation = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "InitialInflation", (.gogoproto.jsontag) = "initial_inflation", (.gogoproto.moretags) = "yaml:&#92;"initial_inflation&#92;""];</code>
     * @return The bytes for initialInflation.
     */
    com.google.protobuf.ByteString
        getInitialInflationBytes();

    /**
     * <pre>
     * Variance defines the fraction by which inflation can vary from ideal inflation in a block.
     * It is a decimal value in the range [0.0, 1.0].
     * </pre>
     *
     * <code>string variance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "Variance", (.gogoproto.jsontag) = "variance", (.gogoproto.moretags) = "yaml:&#92;"variance&#92;""];</code>
     * @return The variance.
     */
    java.lang.String getVariance();
    /**
     * <pre>
     * Variance defines the fraction by which inflation can vary from ideal inflation in a block.
     * It is a decimal value in the range [0.0, 1.0].
     * </pre>
     *
     * <code>string variance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "Variance", (.gogoproto.jsontag) = "variance", (.gogoproto.moretags) = "yaml:&#92;"variance&#92;""];</code>
     * @return The bytes for variance.
     */
    com.google.protobuf.ByteString
        getVarianceBytes();
  }
  /**
   * <pre>
   * Params defines the parameters for the x/deployment package
   * </pre>
   *
   * Protobuf type {@code akash.inflation.v1beta2.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:akash.inflation.v1beta2.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      initialInflation_ = "";
      variance_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Params(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              inflationDecayFactor_ = input.readUInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              initialInflation_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              variance_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return akash.inflation.v1beta2.ParamsOuterClass.internal_static_akash_inflation_v1beta2_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return akash.inflation.v1beta2.ParamsOuterClass.internal_static_akash_inflation_v1beta2_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              akash.inflation.v1beta2.ParamsOuterClass.Params.class, akash.inflation.v1beta2.ParamsOuterClass.Params.Builder.class);
    }

    public static final int INFLATION_DECAY_FACTOR_FIELD_NUMBER = 1;
    private int inflationDecayFactor_;
    /**
     * <pre>
     * InflationDecayFactor is the number of years it takes inflation to halve.
     * </pre>
     *
     * <code>uint32 inflation_decay_factor = 1 [(.gogoproto.customname) = "InflationDecayFactor", (.gogoproto.jsontag) = "inflation_decay_factor", (.gogoproto.moretags) = "yaml:&#92;"inflation_decay_factor&#92;""];</code>
     * @return The inflationDecayFactor.
     */
    @java.lang.Override
    public int getInflationDecayFactor() {
      return inflationDecayFactor_;
    }

    public static final int INITIAL_INFLATION_FIELD_NUMBER = 2;
    private volatile java.lang.Object initialInflation_;
    /**
     * <pre>
     * InitialInflation is the rate at which inflation starts at genesis.
     * It is a decimal value in the range [0.0, 100.0].
     * </pre>
     *
     * <code>string initial_inflation = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "InitialInflation", (.gogoproto.jsontag) = "initial_inflation", (.gogoproto.moretags) = "yaml:&#92;"initial_inflation&#92;""];</code>
     * @return The initialInflation.
     */
    @java.lang.Override
    public java.lang.String getInitialInflation() {
      java.lang.Object ref = initialInflation_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        initialInflation_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * InitialInflation is the rate at which inflation starts at genesis.
     * It is a decimal value in the range [0.0, 100.0].
     * </pre>
     *
     * <code>string initial_inflation = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "InitialInflation", (.gogoproto.jsontag) = "initial_inflation", (.gogoproto.moretags) = "yaml:&#92;"initial_inflation&#92;""];</code>
     * @return The bytes for initialInflation.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getInitialInflationBytes() {
      java.lang.Object ref = initialInflation_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        initialInflation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VARIANCE_FIELD_NUMBER = 3;
    private volatile java.lang.Object variance_;
    /**
     * <pre>
     * Variance defines the fraction by which inflation can vary from ideal inflation in a block.
     * It is a decimal value in the range [0.0, 1.0].
     * </pre>
     *
     * <code>string variance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "Variance", (.gogoproto.jsontag) = "variance", (.gogoproto.moretags) = "yaml:&#92;"variance&#92;""];</code>
     * @return The variance.
     */
    @java.lang.Override
    public java.lang.String getVariance() {
      java.lang.Object ref = variance_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        variance_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Variance defines the fraction by which inflation can vary from ideal inflation in a block.
     * It is a decimal value in the range [0.0, 1.0].
     * </pre>
     *
     * <code>string variance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "Variance", (.gogoproto.jsontag) = "variance", (.gogoproto.moretags) = "yaml:&#92;"variance&#92;""];</code>
     * @return The bytes for variance.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getVarianceBytes() {
      java.lang.Object ref = variance_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        variance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (inflationDecayFactor_ != 0) {
        output.writeUInt32(1, inflationDecayFactor_);
      }
      if (!getInitialInflationBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, initialInflation_);
      }
      if (!getVarianceBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, variance_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (inflationDecayFactor_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, inflationDecayFactor_);
      }
      if (!getInitialInflationBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, initialInflation_);
      }
      if (!getVarianceBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, variance_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof akash.inflation.v1beta2.ParamsOuterClass.Params)) {
        return super.equals(obj);
      }
      akash.inflation.v1beta2.ParamsOuterClass.Params other = (akash.inflation.v1beta2.ParamsOuterClass.Params) obj;

      if (getInflationDecayFactor()
          != other.getInflationDecayFactor()) return false;
      if (!getInitialInflation()
          .equals(other.getInitialInflation())) return false;
      if (!getVariance()
          .equals(other.getVariance())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + INFLATION_DECAY_FACTOR_FIELD_NUMBER;
      hash = (53 * hash) + getInflationDecayFactor();
      hash = (37 * hash) + INITIAL_INFLATION_FIELD_NUMBER;
      hash = (53 * hash) + getInitialInflation().hashCode();
      hash = (37 * hash) + VARIANCE_FIELD_NUMBER;
      hash = (53 * hash) + getVariance().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static akash.inflation.v1beta2.ParamsOuterClass.Params parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(akash.inflation.v1beta2.ParamsOuterClass.Params prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Params defines the parameters for the x/deployment package
     * </pre>
     *
     * Protobuf type {@code akash.inflation.v1beta2.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:akash.inflation.v1beta2.Params)
        akash.inflation.v1beta2.ParamsOuterClass.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return akash.inflation.v1beta2.ParamsOuterClass.internal_static_akash_inflation_v1beta2_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return akash.inflation.v1beta2.ParamsOuterClass.internal_static_akash_inflation_v1beta2_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                akash.inflation.v1beta2.ParamsOuterClass.Params.class, akash.inflation.v1beta2.ParamsOuterClass.Params.Builder.class);
      }

      // Construct using akash.inflation.v1beta2.ParamsOuterClass.Params.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        inflationDecayFactor_ = 0;

        initialInflation_ = "";

        variance_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return akash.inflation.v1beta2.ParamsOuterClass.internal_static_akash_inflation_v1beta2_Params_descriptor;
      }

      @java.lang.Override
      public akash.inflation.v1beta2.ParamsOuterClass.Params getDefaultInstanceForType() {
        return akash.inflation.v1beta2.ParamsOuterClass.Params.getDefaultInstance();
      }

      @java.lang.Override
      public akash.inflation.v1beta2.ParamsOuterClass.Params build() {
        akash.inflation.v1beta2.ParamsOuterClass.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public akash.inflation.v1beta2.ParamsOuterClass.Params buildPartial() {
        akash.inflation.v1beta2.ParamsOuterClass.Params result = new akash.inflation.v1beta2.ParamsOuterClass.Params(this);
        result.inflationDecayFactor_ = inflationDecayFactor_;
        result.initialInflation_ = initialInflation_;
        result.variance_ = variance_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof akash.inflation.v1beta2.ParamsOuterClass.Params) {
          return mergeFrom((akash.inflation.v1beta2.ParamsOuterClass.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(akash.inflation.v1beta2.ParamsOuterClass.Params other) {
        if (other == akash.inflation.v1beta2.ParamsOuterClass.Params.getDefaultInstance()) return this;
        if (other.getInflationDecayFactor() != 0) {
          setInflationDecayFactor(other.getInflationDecayFactor());
        }
        if (!other.getInitialInflation().isEmpty()) {
          initialInflation_ = other.initialInflation_;
          onChanged();
        }
        if (!other.getVariance().isEmpty()) {
          variance_ = other.variance_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        akash.inflation.v1beta2.ParamsOuterClass.Params parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (akash.inflation.v1beta2.ParamsOuterClass.Params) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int inflationDecayFactor_ ;
      /**
       * <pre>
       * InflationDecayFactor is the number of years it takes inflation to halve.
       * </pre>
       *
       * <code>uint32 inflation_decay_factor = 1 [(.gogoproto.customname) = "InflationDecayFactor", (.gogoproto.jsontag) = "inflation_decay_factor", (.gogoproto.moretags) = "yaml:&#92;"inflation_decay_factor&#92;""];</code>
       * @return The inflationDecayFactor.
       */
      @java.lang.Override
      public int getInflationDecayFactor() {
        return inflationDecayFactor_;
      }
      /**
       * <pre>
       * InflationDecayFactor is the number of years it takes inflation to halve.
       * </pre>
       *
       * <code>uint32 inflation_decay_factor = 1 [(.gogoproto.customname) = "InflationDecayFactor", (.gogoproto.jsontag) = "inflation_decay_factor", (.gogoproto.moretags) = "yaml:&#92;"inflation_decay_factor&#92;""];</code>
       * @param value The inflationDecayFactor to set.
       * @return This builder for chaining.
       */
      public Builder setInflationDecayFactor(int value) {
        
        inflationDecayFactor_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * InflationDecayFactor is the number of years it takes inflation to halve.
       * </pre>
       *
       * <code>uint32 inflation_decay_factor = 1 [(.gogoproto.customname) = "InflationDecayFactor", (.gogoproto.jsontag) = "inflation_decay_factor", (.gogoproto.moretags) = "yaml:&#92;"inflation_decay_factor&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearInflationDecayFactor() {
        
        inflationDecayFactor_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object initialInflation_ = "";
      /**
       * <pre>
       * InitialInflation is the rate at which inflation starts at genesis.
       * It is a decimal value in the range [0.0, 100.0].
       * </pre>
       *
       * <code>string initial_inflation = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "InitialInflation", (.gogoproto.jsontag) = "initial_inflation", (.gogoproto.moretags) = "yaml:&#92;"initial_inflation&#92;""];</code>
       * @return The initialInflation.
       */
      public java.lang.String getInitialInflation() {
        java.lang.Object ref = initialInflation_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          initialInflation_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * InitialInflation is the rate at which inflation starts at genesis.
       * It is a decimal value in the range [0.0, 100.0].
       * </pre>
       *
       * <code>string initial_inflation = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "InitialInflation", (.gogoproto.jsontag) = "initial_inflation", (.gogoproto.moretags) = "yaml:&#92;"initial_inflation&#92;""];</code>
       * @return The bytes for initialInflation.
       */
      public com.google.protobuf.ByteString
          getInitialInflationBytes() {
        java.lang.Object ref = initialInflation_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          initialInflation_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * InitialInflation is the rate at which inflation starts at genesis.
       * It is a decimal value in the range [0.0, 100.0].
       * </pre>
       *
       * <code>string initial_inflation = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "InitialInflation", (.gogoproto.jsontag) = "initial_inflation", (.gogoproto.moretags) = "yaml:&#92;"initial_inflation&#92;""];</code>
       * @param value The initialInflation to set.
       * @return This builder for chaining.
       */
      public Builder setInitialInflation(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        initialInflation_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * InitialInflation is the rate at which inflation starts at genesis.
       * It is a decimal value in the range [0.0, 100.0].
       * </pre>
       *
       * <code>string initial_inflation = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "InitialInflation", (.gogoproto.jsontag) = "initial_inflation", (.gogoproto.moretags) = "yaml:&#92;"initial_inflation&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearInitialInflation() {
        
        initialInflation_ = getDefaultInstance().getInitialInflation();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * InitialInflation is the rate at which inflation starts at genesis.
       * It is a decimal value in the range [0.0, 100.0].
       * </pre>
       *
       * <code>string initial_inflation = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "InitialInflation", (.gogoproto.jsontag) = "initial_inflation", (.gogoproto.moretags) = "yaml:&#92;"initial_inflation&#92;""];</code>
       * @param value The bytes for initialInflation to set.
       * @return This builder for chaining.
       */
      public Builder setInitialInflationBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        initialInflation_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object variance_ = "";
      /**
       * <pre>
       * Variance defines the fraction by which inflation can vary from ideal inflation in a block.
       * It is a decimal value in the range [0.0, 1.0].
       * </pre>
       *
       * <code>string variance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "Variance", (.gogoproto.jsontag) = "variance", (.gogoproto.moretags) = "yaml:&#92;"variance&#92;""];</code>
       * @return The variance.
       */
      public java.lang.String getVariance() {
        java.lang.Object ref = variance_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          variance_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Variance defines the fraction by which inflation can vary from ideal inflation in a block.
       * It is a decimal value in the range [0.0, 1.0].
       * </pre>
       *
       * <code>string variance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "Variance", (.gogoproto.jsontag) = "variance", (.gogoproto.moretags) = "yaml:&#92;"variance&#92;""];</code>
       * @return The bytes for variance.
       */
      public com.google.protobuf.ByteString
          getVarianceBytes() {
        java.lang.Object ref = variance_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          variance_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Variance defines the fraction by which inflation can vary from ideal inflation in a block.
       * It is a decimal value in the range [0.0, 1.0].
       * </pre>
       *
       * <code>string variance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "Variance", (.gogoproto.jsontag) = "variance", (.gogoproto.moretags) = "yaml:&#92;"variance&#92;""];</code>
       * @param value The variance to set.
       * @return This builder for chaining.
       */
      public Builder setVariance(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        variance_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Variance defines the fraction by which inflation can vary from ideal inflation in a block.
       * It is a decimal value in the range [0.0, 1.0].
       * </pre>
       *
       * <code>string variance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "Variance", (.gogoproto.jsontag) = "variance", (.gogoproto.moretags) = "yaml:&#92;"variance&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearVariance() {
        
        variance_ = getDefaultInstance().getVariance();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Variance defines the fraction by which inflation can vary from ideal inflation in a block.
       * It is a decimal value in the range [0.0, 1.0].
       * </pre>
       *
       * <code>string variance = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.customname) = "Variance", (.gogoproto.jsontag) = "variance", (.gogoproto.moretags) = "yaml:&#92;"variance&#92;""];</code>
       * @param value The bytes for variance to set.
       * @return This builder for chaining.
       */
      public Builder setVarianceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        variance_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:akash.inflation.v1beta2.Params)
    }

    // @@protoc_insertion_point(class_scope:akash.inflation.v1beta2.Params)
    private static final akash.inflation.v1beta2.ParamsOuterClass.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new akash.inflation.v1beta2.ParamsOuterClass.Params();
    }

    public static akash.inflation.v1beta2.ParamsOuterClass.Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Params>
        PARSER = new com.google.protobuf.AbstractParser<Params>() {
      @java.lang.Override
      public Params parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Params(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public akash.inflation.v1beta2.ParamsOuterClass.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_inflation_v1beta2_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_inflation_v1beta2_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$akash/inflation/v1beta2/params.proto\022\027" +
      "akash.inflation.v1beta2\032\024gogoproto/gogo." +
      "proto\"\373\002\n\006Params\022s\n\026inflation_decay_fact" +
      "or\030\001 \001(\rBS\342\336\037\024InflationDecayFactor\352\336\037\026in" +
      "flation_decay_factor\362\336\037\035yaml:\"inflation_" +
      "decay_factor\"\022\216\001\n\021initial_inflation\030\002 \001(" +
      "\tBs\332\336\037&github.com/cosmos/cosmos-sdk/type" +
      "s.Dec\310\336\037\000\342\336\037\020InitialInflation\352\336\037\021initial" +
      "_inflation\362\336\037\030yaml:\"initial_inflation\"\022k" +
      "\n\010variance\030\003 \001(\tBY\332\336\037&github.com/cosmos/" +
      "cosmos-sdk/types.Dec\310\336\037\000\342\336\037\010Variance\352\336\037\010" +
      "variance\362\336\037\017yaml:\"variance\"B3Z1github.co" +
      "m/ovrclk/akash/x/inflation/types/v1beta2" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf2.GoGoProtos.getDescriptor(),
        });
    internal_static_akash_inflation_v1beta2_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_inflation_v1beta2_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_inflation_v1beta2_Params_descriptor,
        new java.lang.String[] { "InflationDecayFactor", "InitialInflation", "Variance", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.customname);
    registry.add(com.google.protobuf2.GoGoProtos.customtype);
    registry.add(com.google.protobuf2.GoGoProtos.jsontag);
    registry.add(com.google.protobuf2.GoGoProtos.moretags);
    registry.add(com.google.protobuf2.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf2.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
