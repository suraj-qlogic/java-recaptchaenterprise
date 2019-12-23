/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1beta1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1beta1;

/**
 *
 *
 * <pre>
 * Response to request to list keys in a project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1beta1.ListKeysResponse}
 */
public final class ListKeysResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1beta1.ListKeysResponse)
    ListKeysResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListKeysResponse.newBuilder() to construct.
  private ListKeysResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListKeysResponse() {
    keys_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListKeysResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                keys_ = new java.util.ArrayList<com.google.recaptchaenterprise.v1beta1.Key>();
                mutable_bitField0_ |= 0x00000001;
              }
              keys_.add(
                  input.readMessage(
                      com.google.recaptchaenterprise.v1beta1.Key.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        keys_ = java.util.Collections.unmodifiableList(keys_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1beta1_ListKeysResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1beta1_ListKeysResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1beta1.ListKeysResponse.class,
            com.google.recaptchaenterprise.v1beta1.ListKeysResponse.Builder.class);
  }

  private int bitField0_;
  public static final int KEYS_FIELD_NUMBER = 1;
  private java.util.List<com.google.recaptchaenterprise.v1beta1.Key> keys_;
  /**
   *
   *
   * <pre>
   * Key details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
   */
  public java.util.List<com.google.recaptchaenterprise.v1beta1.Key> getKeysList() {
    return keys_;
  }
  /**
   *
   *
   * <pre>
   * Key details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
   */
  public java.util.List<? extends com.google.recaptchaenterprise.v1beta1.KeyOrBuilder>
      getKeysOrBuilderList() {
    return keys_;
  }
  /**
   *
   *
   * <pre>
   * Key details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
   */
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   *
   *
   * <pre>
   * Key details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
   */
  public com.google.recaptchaenterprise.v1beta1.Key getKeys(int index) {
    return keys_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Key details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
   */
  public com.google.recaptchaenterprise.v1beta1.KeyOrBuilder getKeysOrBuilder(int index) {
    return keys_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results. It is set to empty if no keys
   * remain in results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results. It is set to empty if no keys
   * remain in results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < keys_.size(); i++) {
      output.writeMessage(1, keys_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < keys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, keys_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1beta1.ListKeysResponse)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1beta1.ListKeysResponse other =
        (com.google.recaptchaenterprise.v1beta1.ListKeysResponse) obj;

    if (!getKeysList().equals(other.getKeysList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.recaptchaenterprise.v1beta1.ListKeysResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response to request to list keys in a project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1beta1.ListKeysResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1beta1.ListKeysResponse)
      com.google.recaptchaenterprise.v1beta1.ListKeysResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1beta1_ListKeysResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1beta1_ListKeysResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1beta1.ListKeysResponse.class,
              com.google.recaptchaenterprise.v1beta1.ListKeysResponse.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1beta1.ListKeysResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getKeysFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        keysBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1beta1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1beta1_ListKeysResponse_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1beta1.ListKeysResponse getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1beta1.ListKeysResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1beta1.ListKeysResponse build() {
      com.google.recaptchaenterprise.v1beta1.ListKeysResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1beta1.ListKeysResponse buildPartial() {
      com.google.recaptchaenterprise.v1beta1.ListKeysResponse result =
          new com.google.recaptchaenterprise.v1beta1.ListKeysResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (keysBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          keys_ = java.util.Collections.unmodifiableList(keys_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.keys_ = keys_;
      } else {
        result.keys_ = keysBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.recaptchaenterprise.v1beta1.ListKeysResponse) {
        return mergeFrom((com.google.recaptchaenterprise.v1beta1.ListKeysResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1beta1.ListKeysResponse other) {
      if (other == com.google.recaptchaenterprise.v1beta1.ListKeysResponse.getDefaultInstance())
        return this;
      if (keysBuilder_ == null) {
        if (!other.keys_.isEmpty()) {
          if (keys_.isEmpty()) {
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKeysIsMutable();
            keys_.addAll(other.keys_);
          }
          onChanged();
        }
      } else {
        if (!other.keys_.isEmpty()) {
          if (keysBuilder_.isEmpty()) {
            keysBuilder_.dispose();
            keysBuilder_ = null;
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000001);
            keysBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getKeysFieldBuilder()
                    : null;
          } else {
            keysBuilder_.addAllMessages(other.keys_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.recaptchaenterprise.v1beta1.ListKeysResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.recaptchaenterprise.v1beta1.ListKeysResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.recaptchaenterprise.v1beta1.Key> keys_ =
        java.util.Collections.emptyList();

    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keys_ = new java.util.ArrayList<com.google.recaptchaenterprise.v1beta1.Key>(keys_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.recaptchaenterprise.v1beta1.Key,
            com.google.recaptchaenterprise.v1beta1.Key.Builder,
            com.google.recaptchaenterprise.v1beta1.KeyOrBuilder>
        keysBuilder_;

    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public java.util.List<com.google.recaptchaenterprise.v1beta1.Key> getKeysList() {
      if (keysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keys_);
      } else {
        return keysBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public int getKeysCount() {
      if (keysBuilder_ == null) {
        return keys_.size();
      } else {
        return keysBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public com.google.recaptchaenterprise.v1beta1.Key getKeys(int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);
      } else {
        return keysBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public Builder setKeys(int index, com.google.recaptchaenterprise.v1beta1.Key value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.set(index, value);
        onChanged();
      } else {
        keysBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public Builder setKeys(
        int index, com.google.recaptchaenterprise.v1beta1.Key.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.set(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public Builder addKeys(com.google.recaptchaenterprise.v1beta1.Key value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(value);
        onChanged();
      } else {
        keysBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public Builder addKeys(int index, com.google.recaptchaenterprise.v1beta1.Key value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(index, value);
        onChanged();
      } else {
        keysBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public Builder addKeys(com.google.recaptchaenterprise.v1beta1.Key.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public Builder addKeys(
        int index, com.google.recaptchaenterprise.v1beta1.Key.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public Builder addAllKeys(
        java.lang.Iterable<? extends com.google.recaptchaenterprise.v1beta1.Key> values) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, keys_);
        onChanged();
      } else {
        keysBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public Builder clearKeys() {
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keysBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public Builder removeKeys(int index) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.remove(index);
        onChanged();
      } else {
        keysBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public com.google.recaptchaenterprise.v1beta1.Key.Builder getKeysBuilder(int index) {
      return getKeysFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public com.google.recaptchaenterprise.v1beta1.KeyOrBuilder getKeysOrBuilder(int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);
      } else {
        return keysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public java.util.List<? extends com.google.recaptchaenterprise.v1beta1.KeyOrBuilder>
        getKeysOrBuilderList() {
      if (keysBuilder_ != null) {
        return keysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keys_);
      }
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public com.google.recaptchaenterprise.v1beta1.Key.Builder addKeysBuilder() {
      return getKeysFieldBuilder()
          .addBuilder(com.google.recaptchaenterprise.v1beta1.Key.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public com.google.recaptchaenterprise.v1beta1.Key.Builder addKeysBuilder(int index) {
      return getKeysFieldBuilder()
          .addBuilder(index, com.google.recaptchaenterprise.v1beta1.Key.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Key details.
     * </pre>
     *
     * <code>repeated .google.cloud.recaptchaenterprise.v1beta1.Key keys = 1;</code>
     */
    public java.util.List<com.google.recaptchaenterprise.v1beta1.Key.Builder> getKeysBuilderList() {
      return getKeysFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.recaptchaenterprise.v1beta1.Key,
            com.google.recaptchaenterprise.v1beta1.Key.Builder,
            com.google.recaptchaenterprise.v1beta1.KeyOrBuilder>
        getKeysFieldBuilder() {
      if (keysBuilder_ == null) {
        keysBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.recaptchaenterprise.v1beta1.Key,
                com.google.recaptchaenterprise.v1beta1.Key.Builder,
                com.google.recaptchaenterprise.v1beta1.KeyOrBuilder>(
                keys_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        keys_ = null;
      }
      return keysBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results. It is set to empty if no keys
     * remain in results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results. It is set to empty if no keys
     * remain in results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results. It is set to empty if no keys
     * remain in results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results. It is set to empty if no keys
     * remain in results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results. It is set to empty if no keys
     * remain in results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1beta1.ListKeysResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1beta1.ListKeysResponse)
  private static final com.google.recaptchaenterprise.v1beta1.ListKeysResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1beta1.ListKeysResponse();
  }

  public static com.google.recaptchaenterprise.v1beta1.ListKeysResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListKeysResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListKeysResponse>() {
        @java.lang.Override
        public ListKeysResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListKeysResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListKeysResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListKeysResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1beta1.ListKeysResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
