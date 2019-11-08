// Code generated by protoc-gen-go. DO NOT EDIT.
// source: github.com/openbank/openbank/v1/bank/all.proto

package bank

import (
	context "context"
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	empty "github.com/golang/protobuf/ptypes/empty"
	_ "github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger/options"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

// BankRouting holds all the details about a bank routing.
type BankRouting struct {
	// Scheme is the routing scheme.
	Scheme string `protobuf:"bytes,1,opt,name=Scheme,json=scheme,proto3" json:"Scheme,omitempty"`
	// Address is the routing address.
	Address              string   `protobuf:"bytes,2,opt,name=Address,json=address,proto3" json:"Address,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *BankRouting) Reset()         { *m = BankRouting{} }
func (m *BankRouting) String() string { return proto.CompactTextString(m) }
func (*BankRouting) ProtoMessage()    {}
func (*BankRouting) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f46d22d7586d6ab, []int{0}
}

func (m *BankRouting) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_BankRouting.Unmarshal(m, b)
}
func (m *BankRouting) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_BankRouting.Marshal(b, m, deterministic)
}
func (m *BankRouting) XXX_Merge(src proto.Message) {
	xxx_messageInfo_BankRouting.Merge(m, src)
}
func (m *BankRouting) XXX_Size() int {
	return xxx_messageInfo_BankRouting.Size(m)
}
func (m *BankRouting) XXX_DiscardUnknown() {
	xxx_messageInfo_BankRouting.DiscardUnknown(m)
}

var xxx_messageInfo_BankRouting proto.InternalMessageInfo

func (m *BankRouting) GetScheme() string {
	if m != nil {
		return m.Scheme
	}
	return ""
}

func (m *BankRouting) GetAddress() string {
	if m != nil {
		return m.Address
	}
	return ""
}

// Bank holds all details about a bank.
type Bank struct {
	// ID is an identifier for the bank.
	ID string `protobuf:"bytes,1,opt,name=ID,json=id,proto3" json:"ID,omitempty"`
	// FullName is the full name of the bank.
	FullName string `protobuf:"bytes,2,opt,name=FullName,json=full_name,proto3" json:"FullName,omitempty"`
	// ShortName is the short name of the bank.
	ShortName string `protobuf:"bytes,3,opt,name=ShortName,json=short_name,proto3" json:"ShortName,omitempty"`
	// LogoURL is the url for the bank's logo.
	LogoURL string `protobuf:"bytes,4,opt,name=LogoURL,json=logo_url,proto3" json:"LogoURL,omitempty"`
	// WebsiteURL is the url for the bank's website.
	WebsiteURL string `protobuf:"bytes,5,opt,name=WebsiteURL,json=website_url,proto3" json:"WebsiteURL,omitempty"`
	// SwiftBIC is the SWIFT bank identifier code.
	SwiftBIC string `protobuf:"bytes,6,opt,name=SwiftBIC,json=swift_bic,proto3" json:"SwiftBIC,omitempty"`
	// NationalIdentifier is the national identifier code.
	NationalIdentifier string `protobuf:"bytes,7,opt,name=NationalIdentifier,json=national_identifier,proto3" json:"NationalIdentifier,omitempty"`
	// BankRouting is the routing information for the bank.
	BankRouting          *BankRouting `protobuf:"bytes,8,opt,name=BankRouting,json=bank_routing,proto3" json:"BankRouting,omitempty"`
	XXX_NoUnkeyedLiteral struct{}     `json:"-"`
	XXX_unrecognized     []byte       `json:"-"`
	XXX_sizecache        int32        `json:"-"`
}

func (m *Bank) Reset()         { *m = Bank{} }
func (m *Bank) String() string { return proto.CompactTextString(m) }
func (*Bank) ProtoMessage()    {}
func (*Bank) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f46d22d7586d6ab, []int{1}
}

func (m *Bank) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Bank.Unmarshal(m, b)
}
func (m *Bank) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Bank.Marshal(b, m, deterministic)
}
func (m *Bank) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Bank.Merge(m, src)
}
func (m *Bank) XXX_Size() int {
	return xxx_messageInfo_Bank.Size(m)
}
func (m *Bank) XXX_DiscardUnknown() {
	xxx_messageInfo_Bank.DiscardUnknown(m)
}

var xxx_messageInfo_Bank proto.InternalMessageInfo

func (m *Bank) GetID() string {
	if m != nil {
		return m.ID
	}
	return ""
}

func (m *Bank) GetFullName() string {
	if m != nil {
		return m.FullName
	}
	return ""
}

func (m *Bank) GetShortName() string {
	if m != nil {
		return m.ShortName
	}
	return ""
}

func (m *Bank) GetLogoURL() string {
	if m != nil {
		return m.LogoURL
	}
	return ""
}

func (m *Bank) GetWebsiteURL() string {
	if m != nil {
		return m.WebsiteURL
	}
	return ""
}

func (m *Bank) GetSwiftBIC() string {
	if m != nil {
		return m.SwiftBIC
	}
	return ""
}

func (m *Bank) GetNationalIdentifier() string {
	if m != nil {
		return m.NationalIdentifier
	}
	return ""
}

func (m *Bank) GetBankRouting() *BankRouting {
	if m != nil {
		return m.BankRouting
	}
	return nil
}

// TransactionType is holds the information about transaction type at a bank.
type TransactionType struct {
	// ID is an identifier for the transaction type.
	ID string `protobuf:"bytes,1,opt,name=ID,json=id,proto3" json:"ID,omitempty"`
	// BankID is an identifier for the bank for the particular transaction type.
	BankID string `protobuf:"bytes,2,opt,name=BankID,json=bankId,proto3" json:"BankID,omitempty"`
	// ShortCode is the short code of the transaction type.
	ShortCode string `protobuf:"bytes,3,opt,name=ShortCode,json=short_code,proto3" json:"ShortCode,omitempty"`
	// Summary is the summary of the trasnaction type.
	Summary string `protobuf:"bytes,4,opt,name=Summary,json=summary,proto3" json:"Summary,omitempty"`
	// Description is the description of the transaction type.
	Description string `protobuf:"bytes,5,opt,name=Description,json=description,proto3" json:"Description,omitempty"`
	// Currency is the currency of the transaction type.
	Currency string `protobuf:"bytes,6,opt,name=Currency,json=currency,proto3" json:"Currency,omitempty"`
	// Amount is the amount of the transaction type.
	Amount               string   `protobuf:"bytes,7,opt,name=Amount,json=amount,proto3" json:"Amount,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *TransactionType) Reset()         { *m = TransactionType{} }
func (m *TransactionType) String() string { return proto.CompactTextString(m) }
func (*TransactionType) ProtoMessage()    {}
func (*TransactionType) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f46d22d7586d6ab, []int{2}
}

func (m *TransactionType) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_TransactionType.Unmarshal(m, b)
}
func (m *TransactionType) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_TransactionType.Marshal(b, m, deterministic)
}
func (m *TransactionType) XXX_Merge(src proto.Message) {
	xxx_messageInfo_TransactionType.Merge(m, src)
}
func (m *TransactionType) XXX_Size() int {
	return xxx_messageInfo_TransactionType.Size(m)
}
func (m *TransactionType) XXX_DiscardUnknown() {
	xxx_messageInfo_TransactionType.DiscardUnknown(m)
}

var xxx_messageInfo_TransactionType proto.InternalMessageInfo

func (m *TransactionType) GetID() string {
	if m != nil {
		return m.ID
	}
	return ""
}

func (m *TransactionType) GetBankID() string {
	if m != nil {
		return m.BankID
	}
	return ""
}

func (m *TransactionType) GetShortCode() string {
	if m != nil {
		return m.ShortCode
	}
	return ""
}

func (m *TransactionType) GetSummary() string {
	if m != nil {
		return m.Summary
	}
	return ""
}

func (m *TransactionType) GetDescription() string {
	if m != nil {
		return m.Description
	}
	return ""
}

func (m *TransactionType) GetCurrency() string {
	if m != nil {
		return m.Currency
	}
	return ""
}

func (m *TransactionType) GetAmount() string {
	if m != nil {
		return m.Amount
	}
	return ""
}

// CreateBankRequest is a request envelope to create a bank.
type CreateBankRequest struct {
	// Bank is the related information about a bank.
	Bank                 *Bank    `protobuf:"bytes,1,opt,name=Bank,json=bank,proto3" json:"Bank,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CreateBankRequest) Reset()         { *m = CreateBankRequest{} }
func (m *CreateBankRequest) String() string { return proto.CompactTextString(m) }
func (*CreateBankRequest) ProtoMessage()    {}
func (*CreateBankRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f46d22d7586d6ab, []int{3}
}

func (m *CreateBankRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateBankRequest.Unmarshal(m, b)
}
func (m *CreateBankRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateBankRequest.Marshal(b, m, deterministic)
}
func (m *CreateBankRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateBankRequest.Merge(m, src)
}
func (m *CreateBankRequest) XXX_Size() int {
	return xxx_messageInfo_CreateBankRequest.Size(m)
}
func (m *CreateBankRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateBankRequest.DiscardUnknown(m)
}

var xxx_messageInfo_CreateBankRequest proto.InternalMessageInfo

func (m *CreateBankRequest) GetBank() *Bank {
	if m != nil {
		return m.Bank
	}
	return nil
}

// UpdateBankRequest is the request envelope to update a bank.
type UpdateBankRequest struct {
	// Bank is the related information about a bank.
	Bank                 *Bank    `protobuf:"bytes,1,opt,name=Bank,json=bank,proto3" json:"Bank,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *UpdateBankRequest) Reset()         { *m = UpdateBankRequest{} }
func (m *UpdateBankRequest) String() string { return proto.CompactTextString(m) }
func (*UpdateBankRequest) ProtoMessage()    {}
func (*UpdateBankRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f46d22d7586d6ab, []int{4}
}

func (m *UpdateBankRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateBankRequest.Unmarshal(m, b)
}
func (m *UpdateBankRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateBankRequest.Marshal(b, m, deterministic)
}
func (m *UpdateBankRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateBankRequest.Merge(m, src)
}
func (m *UpdateBankRequest) XXX_Size() int {
	return xxx_messageInfo_UpdateBankRequest.Size(m)
}
func (m *UpdateBankRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateBankRequest.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateBankRequest proto.InternalMessageInfo

func (m *UpdateBankRequest) GetBank() *Bank {
	if m != nil {
		return m.Bank
	}
	return nil
}

// DeleteBankRequest is the request envelope to delete a bank.
type DeleteBankRequest struct {
	// ID is the bank unique identifier.
	ID                   string   `protobuf:"bytes,1,opt,name=ID,json=id,proto3" json:"ID,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *DeleteBankRequest) Reset()         { *m = DeleteBankRequest{} }
func (m *DeleteBankRequest) String() string { return proto.CompactTextString(m) }
func (*DeleteBankRequest) ProtoMessage()    {}
func (*DeleteBankRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f46d22d7586d6ab, []int{5}
}

func (m *DeleteBankRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_DeleteBankRequest.Unmarshal(m, b)
}
func (m *DeleteBankRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_DeleteBankRequest.Marshal(b, m, deterministic)
}
func (m *DeleteBankRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DeleteBankRequest.Merge(m, src)
}
func (m *DeleteBankRequest) XXX_Size() int {
	return xxx_messageInfo_DeleteBankRequest.Size(m)
}
func (m *DeleteBankRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_DeleteBankRequest.DiscardUnknown(m)
}

var xxx_messageInfo_DeleteBankRequest proto.InternalMessageInfo

func (m *DeleteBankRequest) GetID() string {
	if m != nil {
		return m.ID
	}
	return ""
}

// GetBankRequest is the request envelope to get the bank data.
type GetBankRequest struct {
	// ID is the bank unique identifier.
	ID string `protobuf:"bytes,1,opt,name=ID,json=id,proto3" json:"ID,omitempty"`
	// FullName is the full name of the bank.
	FullName string `protobuf:"bytes,2,opt,name=FullName,json=full_name,proto3" json:"FullName,omitempty"`
	// ShortName is the short name of the bank.
	ShortName string `protobuf:"bytes,3,opt,name=ShortName,json=short_name,proto3" json:"ShortName,omitempty"`
	// WebsiteURL is the url for the bank's website.
	WebsiteURL           string   `protobuf:"bytes,4,opt,name=WebsiteURL,json=website_url,proto3" json:"WebsiteURL,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetBankRequest) Reset()         { *m = GetBankRequest{} }
func (m *GetBankRequest) String() string { return proto.CompactTextString(m) }
func (*GetBankRequest) ProtoMessage()    {}
func (*GetBankRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f46d22d7586d6ab, []int{6}
}

func (m *GetBankRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetBankRequest.Unmarshal(m, b)
}
func (m *GetBankRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetBankRequest.Marshal(b, m, deterministic)
}
func (m *GetBankRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetBankRequest.Merge(m, src)
}
func (m *GetBankRequest) XXX_Size() int {
	return xxx_messageInfo_GetBankRequest.Size(m)
}
func (m *GetBankRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetBankRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetBankRequest proto.InternalMessageInfo

func (m *GetBankRequest) GetID() string {
	if m != nil {
		return m.ID
	}
	return ""
}

func (m *GetBankRequest) GetFullName() string {
	if m != nil {
		return m.FullName
	}
	return ""
}

func (m *GetBankRequest) GetShortName() string {
	if m != nil {
		return m.ShortName
	}
	return ""
}

func (m *GetBankRequest) GetWebsiteURL() string {
	if m != nil {
		return m.WebsiteURL
	}
	return ""
}

// GetBanksResponse is the response for GetBanks
type GetBanksResponse struct {
	// Banks is the list of the banks.
	Banks                []*Bank  `protobuf:"bytes,1,rep,name=Banks,json=banks,proto3" json:"Banks,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetBanksResponse) Reset()         { *m = GetBanksResponse{} }
func (m *GetBanksResponse) String() string { return proto.CompactTextString(m) }
func (*GetBanksResponse) ProtoMessage()    {}
func (*GetBanksResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f46d22d7586d6ab, []int{7}
}

func (m *GetBanksResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetBanksResponse.Unmarshal(m, b)
}
func (m *GetBanksResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetBanksResponse.Marshal(b, m, deterministic)
}
func (m *GetBanksResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetBanksResponse.Merge(m, src)
}
func (m *GetBanksResponse) XXX_Size() int {
	return xxx_messageInfo_GetBanksResponse.Size(m)
}
func (m *GetBanksResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetBanksResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetBanksResponse proto.InternalMessageInfo

func (m *GetBanksResponse) GetBanks() []*Bank {
	if m != nil {
		return m.Banks
	}
	return nil
}

// CreateTransactionTypeAtBankRequest is the request envelope to create a new
//transaction type.
type CreateTransactionTypeAtBankRequest struct {
	// TransactionType is the related information about a transaction type at a bank.
	TransactionType      *TransactionType `protobuf:"bytes,1,opt,name=TransactionType,json=transaction_type,proto3" json:"TransactionType,omitempty"`
	XXX_NoUnkeyedLiteral struct{}         `json:"-"`
	XXX_unrecognized     []byte           `json:"-"`
	XXX_sizecache        int32            `json:"-"`
}

func (m *CreateTransactionTypeAtBankRequest) Reset()         { *m = CreateTransactionTypeAtBankRequest{} }
func (m *CreateTransactionTypeAtBankRequest) String() string { return proto.CompactTextString(m) }
func (*CreateTransactionTypeAtBankRequest) ProtoMessage()    {}
func (*CreateTransactionTypeAtBankRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_0f46d22d7586d6ab, []int{8}
}

func (m *CreateTransactionTypeAtBankRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateTransactionTypeAtBankRequest.Unmarshal(m, b)
}
func (m *CreateTransactionTypeAtBankRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateTransactionTypeAtBankRequest.Marshal(b, m, deterministic)
}
func (m *CreateTransactionTypeAtBankRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateTransactionTypeAtBankRequest.Merge(m, src)
}
func (m *CreateTransactionTypeAtBankRequest) XXX_Size() int {
	return xxx_messageInfo_CreateTransactionTypeAtBankRequest.Size(m)
}
func (m *CreateTransactionTypeAtBankRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateTransactionTypeAtBankRequest.DiscardUnknown(m)
}

var xxx_messageInfo_CreateTransactionTypeAtBankRequest proto.InternalMessageInfo

func (m *CreateTransactionTypeAtBankRequest) GetTransactionType() *TransactionType {
	if m != nil {
		return m.TransactionType
	}
	return nil
}

func init() {
	proto.RegisterType((*BankRouting)(nil), "bank.BankRouting")
	proto.RegisterType((*Bank)(nil), "bank.Bank")
	proto.RegisterType((*TransactionType)(nil), "bank.TransactionType")
	proto.RegisterType((*CreateBankRequest)(nil), "bank.CreateBankRequest")
	proto.RegisterType((*UpdateBankRequest)(nil), "bank.UpdateBankRequest")
	proto.RegisterType((*DeleteBankRequest)(nil), "bank.DeleteBankRequest")
	proto.RegisterType((*GetBankRequest)(nil), "bank.GetBankRequest")
	proto.RegisterType((*GetBanksResponse)(nil), "bank.GetBanksResponse")
	proto.RegisterType((*CreateTransactionTypeAtBankRequest)(nil), "bank.CreateTransactionTypeAtBankRequest")
}

func init() {
	proto.RegisterFile("github.com/openbank/openbank/v1/bank/all.proto", fileDescriptor_0f46d22d7586d6ab)
}

var fileDescriptor_0f46d22d7586d6ab = []byte{
	// 1609 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xb4, 0x57, 0x4d, 0x6c, 0x23, 0x49,
	0x15, 0xee, 0xb6, 0x13, 0xc7, 0x53, 0x61, 0x87, 0x4c, 0x2d, 0x0c, 0xa6, 0x67, 0x58, 0x15, 0x9e,
	0xcd, 0x24, 0x84, 0x99, 0xb6, 0xe3, 0x19, 0xb4, 0x10, 0x40, 0x8b, 0x93, 0xec, 0xce, 0x38, 0x8a,
	0x66, 0x23, 0x67, 0x86, 0x45, 0x7b, 0x89, 0xca, 0xdd, 0xcf, 0x76, 0x93, 0x76, 0x55, 0x53, 0x55,
	0x9d, 0xac, 0x17, 0x81, 0x10, 0x12, 0x68, 0x40, 0x1c, 0x56, 0x59, 0x71, 0xe7, 0x80, 0xc4, 0x99,
	0x03, 0xd2, 0x1e, 0xb9, 0xc3, 0x01, 0x89, 0x0b, 0x37, 0x2e, 0x08, 0x09, 0x71, 0x01, 0x0e, 0x08,
	0x38, 0xa1, 0xaa, 0xb2, 0xdb, 0x76, 0xda, 0x0e, 0x2c, 0x3f, 0x27, 0xa7, 0xfb, 0xbd, 0x7a, 0xef,
	0x7d, 0xdf, 0xfb, 0xde, 0xab, 0x34, 0xf2, 0x7b, 0x91, 0xea, 0xa7, 0x1d, 0x3f, 0xe0, 0x83, 0x1a,
	0x4f, 0x80, 0x75, 0x28, 0x3b, 0x9d, 0xfc, 0x71, 0xb6, 0x5d, 0x33, 0xbf, 0x34, 0x8e, 0xfd, 0x44,
	0x70, 0xc5, 0xf1, 0x92, 0x7e, 0xf6, 0x6e, 0xf7, 0x38, 0xef, 0xc5, 0x50, 0xa3, 0x49, 0x54, 0xa3,
	0x8c, 0x71, 0x45, 0x55, 0xc4, 0x99, 0xb4, 0x3e, 0xde, 0x3d, 0xf3, 0x13, 0xdc, 0xef, 0x01, 0xbb,
	0x2f, 0xcf, 0x69, 0xaf, 0x07, 0xa2, 0xc6, 0x13, 0xe3, 0x31, 0xc7, 0xfb, 0xd6, 0x28, 0x96, 0x79,
	0xea, 0xa4, 0xdd, 0x1a, 0x0c, 0x12, 0x35, 0xb4, 0xc6, 0xea, 0x09, 0x5a, 0xdd, 0xa5, 0xec, 0xb4,
	0xcd, 0x53, 0x15, 0xb1, 0x1e, 0xae, 0xa2, 0xd2, 0x71, 0xd0, 0x87, 0x01, 0x54, 0x5c, 0xe2, 0x6e,
	0x5e, 0xdb, 0x45, 0x65, 0xa7, 0xe2, 0x6c, 0x3a, 0x75, 0xe7, 0xc8, 0x69, 0x97, 0xa4, 0xb1, 0xe0,
	0x97, 0xd1, 0x4a, 0x33, 0x0c, 0x05, 0x48, 0x59, 0x29, 0xe4, 0x9c, 0x56, 0xa8, 0x35, 0xed, 0x94,
	0xca, 0xce, 0x9a, 0x53, 0x71, 0xaa, 0xff, 0x28, 0xa0, 0x25, 0x9d, 0x01, 0x7b, 0xa8, 0xd0, 0xda,
	0x9f, 0x13, 0xb6, 0x10, 0x85, 0x78, 0x03, 0x95, 0x5f, 0x4f, 0xe3, 0xf8, 0x09, 0x1d, 0xc0, 0x9c,
	0x98, 0xd7, 0xba, 0x69, 0x1c, 0x9f, 0x30, 0x3a, 0x00, 0xfc, 0x29, 0x74, 0xed, 0xb8, 0xcf, 0x85,
	0x32, 0x9e, 0xc5, 0x9c, 0x27, 0x92, 0xda, 0x68, 0x5d, 0xd7, 0xd1, 0xca, 0x21, 0xef, 0xf1, 0x67,
	0xed, 0xc3, 0xca, 0x52, 0xce, 0xb1, 0x1c, 0xf3, 0x1e, 0x3f, 0x49, 0x45, 0x8c, 0x3f, 0x8d, 0xd0,
	0x9b, 0xd0, 0x91, 0x91, 0x02, 0xed, 0xb9, 0x9c, 0xf3, 0x5c, 0x3d, 0xb7, 0x56, 0xe3, 0xbc, 0x81,
	0xca, 0xc7, 0xe7, 0x51, 0x57, 0xed, 0xb6, 0xf6, 0x2a, 0xa5, 0x7c, 0x9d, 0x52, 0xdb, 0x4e, 0x3a,
	0x51, 0x80, 0x3f, 0x8f, 0xf0, 0x13, 0xd3, 0x04, 0x1a, 0xb7, 0x42, 0x60, 0x2a, 0xea, 0x46, 0x20,
	0x2a, 0x2b, 0xb9, 0x23, 0x2f, 0xb2, 0x91, 0xd7, 0x49, 0x94, 0xb9, 0xe1, 0x2f, 0xcd, 0xf4, 0xa4,
	0x52, 0x26, 0xee, 0xe6, 0x6a, 0xe3, 0x86, 0xaf, 0x85, 0xe1, 0x4f, 0x19, 0x66, 0x02, 0x7d, 0x48,
	0x5b, 0x4f, 0x84, 0xb5, 0x64, 0xe4, 0xff, 0xb8, 0x80, 0x3e, 0xfc, 0x54, 0x50, 0x26, 0x69, 0xa0,
	0xd3, 0x3c, 0x1d, 0x26, 0x70, 0x65, 0x1f, 0xaa, 0xa8, 0xa4, 0x13, 0xb4, 0xf6, 0xe7, 0x74, 0xa1,
	0xa4, 0x33, 0xb4, 0xc2, 0xac, 0x05, 0x7b, 0x3c, 0xbc, 0xa2, 0x05, 0x01, 0x0f, 0x8d, 0x52, 0x8e,
	0xd3, 0xc1, 0x80, 0x8a, 0xe1, 0x9c, 0x16, 0xac, 0x48, 0x6b, 0xc2, 0xf7, 0xd0, 0xea, 0x3e, 0xc8,
	0x40, 0x44, 0x46, 0xc1, 0xf3, 0x5a, 0x10, 0x4e, 0xcc, 0xf8, 0x2e, 0x2a, 0xef, 0xa5, 0x42, 0x00,
	0x0b, 0x86, 0x73, 0x5a, 0x50, 0x0e, 0x46, 0x36, 0x0d, 0xa5, 0x39, 0xe0, 0x29, 0x53, 0x73, 0x58,
	0x2f, 0x51, 0x63, 0xc9, 0x68, 0x7a, 0x84, 0x6e, 0xec, 0x09, 0xa0, 0x0a, 0x0c, 0xbb, 0xf0, 0xb5,
	0x14, 0xa4, 0xc2, 0x5b, 0x56, 0xb7, 0x86, 0xa9, 0xd5, 0x06, 0x9a, 0xd0, 0x3f, 0x13, 0xca, 0x8c,
	0xeb, 0x74, 0xa0, 0x67, 0x49, 0xf8, 0x3f, 0x08, 0xf4, 0x0a, 0xba, 0xb1, 0x0f, 0x31, 0xcc, 0x06,
	0xba, 0xa2, 0x73, 0xd9, 0xc1, 0x9f, 0xb9, 0xe8, 0xfa, 0x23, 0x50, 0xff, 0xe6, 0xb1, 0xff, 0xcb,
	0xe0, 0xcd, 0x4e, 0xd4, 0xd2, 0x95, 0x13, 0x95, 0xd5, 0xfd, 0x18, 0xad, 0x8d, 0xca, 0x96, 0x6d,
	0x90, 0x09, 0x67, 0x12, 0xf0, 0x3d, 0xb4, 0x6c, 0x5e, 0x54, 0x5c, 0x52, 0xbc, 0x82, 0xb9, 0x65,
	0xfd, 0x7a, 0xb2, 0x70, 0xde, 0x41, 0x55, 0xdb, 0xcc, 0x4b, 0xc2, 0x6f, 0xce, 0x90, 0x72, 0x98,
	0x1b, 0x8c, 0x51, 0x7f, 0x3e, 0x6a, 0xb3, 0x5c, 0x32, 0xce, 0x24, 0x5c, 0x53, 0x13, 0xe3, 0x89,
	0x1a, 0x26, 0x30, 0xce, 0xdd, 0xf8, 0xf9, 0x0b, 0x76, 0x74, 0x8f, 0x41, 0x9c, 0x45, 0x01, 0xe0,
	0xf7, 0x0b, 0x68, 0x65, 0x04, 0x0b, 0x7f, 0xc4, 0x06, 0x9e, 0x6d, 0x8e, 0x37, 0x05, 0xaa, 0xfa,
	0xdd, 0xc2, 0x45, 0xf3, 0xf7, 0xee, 0x68, 0x5d, 0x7e, 0xbc, 0x0d, 0x4a, 0x44, 0x70, 0x06, 0x44,
	0x3b, 0x90, 0x88, 0x75, 0xb9, 0x18, 0x98, 0x65, 0xe1, 0xbd, 0x92, 0x99, 0xa6, 0xde, 0x12, 0xda,
	0xe1, 0xa9, 0x22, 0xaa, 0x3f, 0x3a, 0x20, 0x13, 0x08, 0xf4, 0x3a, 0x09, 0x49, 0x67, 0x68, 0xde,
	0xb6, 0xf6, 0x0f, 0xf6, 0x50, 0xb1, 0x51, 0xaf, 0xe3, 0x2f, 0xa0, 0x97, 0x46, 0xe9, 0x09, 0xbc,
	0x0d, 0x41, 0xaa, 0x20, 0x24, 0x32, 0x0d, 0x02, 0x90, 0x52, 0x37, 0x7c, 0xe8, 0x63, 0x0f, 0x55,
	0xbc, 0x9b, 0x77, 0x6a, 0x21, 0x74, 0x23, 0x16, 0xd9, 0x7b, 0x45, 0x07, 0xd5, 0x85, 0x1d, 0x6c,
	0xa3, 0xe2, 0xc3, 0xfa, 0x43, 0xbc, 0x85, 0x36, 0xdb, 0xa0, 0x52, 0xc1, 0x20, 0x24, 0xe7, 0x7d,
	0x60, 0x26, 0x87, 0x00, 0xc9, 0x53, 0x11, 0x00, 0x89, 0x24, 0x61, 0x5c, 0x91, 0x2e, 0x4f, 0x59,
	0xe8, 0x77, 0x30, 0x5a, 0x43, 0xa5, 0x37, 0x9a, 0xa9, 0xea, 0x37, 0x70, 0x09, 0x2d, 0xb5, 0x81,
	0x86, 0xdf, 0xfe, 0xf5, 0xef, 0xde, 0x2b, 0xac, 0xe1, 0xeb, 0xe3, 0x1b, 0x50, 0xd6, 0xbe, 0xde,
	0xda, 0xff, 0xc6, 0xf3, 0x82, 0xf3, 0x6e, 0xc1, 0xd0, 0x8c, 0x7f, 0x51, 0x40, 0xe5, 0xb1, 0x22,
	0xf0, 0x4d, 0xdf, 0xde, 0x61, 0xfe, 0xf8, 0x0e, 0xf3, 0x5f, 0xd3, 0x77, 0x98, 0x77, 0x73, 0x86,
	0xd3, 0x4c, 0x39, 0xd5, 0x1f, 0x14, 0x2e, 0x9a, 0x7f, 0x1e, 0x33, 0x79, 0x3b, 0xa3, 0x8b, 0xc6,
	0x31, 0xa1, 0x67, 0x34, 0x8a, 0x69, 0x27, 0xb6, 0x34, 0x49, 0xef, 0xc1, 0x5c, 0x32, 0x05, 0xf4,
	0xa8, 0x08, 0x23, 0xd6, 0x9b, 0x77, 0xc6, 0xff, 0x0f, 0x38, 0x38, 0x78, 0xc3, 0x72, 0xff, 0xf8,
	0x5f, 0x72, 0x7f, 0x17, 0xbd, 0xec, 0x55, 0xf3, 0xdc, 0x5f, 0xc6, 0xb8, 0x90, 0xd4, 0x55, 0x7c,
	0x2d, 0x23, 0xd5, 0xf2, 0x59, 0x77, 0xf0, 0x1f, 0x5c, 0x84, 0x26, 0x2b, 0x0e, 0x7f, 0xcc, 0xf2,
	0x96, 0x5b, 0x7a, 0x33, 0x72, 0xfc, 0xa9, 0x7b, 0xd1, 0x7c, 0x6f, 0x4c, 0xe2, 0x0b, 0xd6, 0x97,
	0x50, 0x43, 0x81, 0x77, 0xd7, 0x3e, 0x4a, 0x42, 0x09, 0x83, 0x73, 0xab, 0x38, 0xca, 0x42, 0x22,
	0x0c, 0x1d, 0x92, 0x44, 0x4a, 0x92, 0x28, 0xf4, 0x0f, 0x5e, 0xd5, 0xa8, 0xb7, 0xf1, 0x67, 0x91,
	0xa7, 0xa3, 0x90, 0xc0, 0x9c, 0xfa, 0x00, 0x6a, 0xeb, 0xbc, 0x88, 0x6e, 0x64, 0x28, 0x57, 0xd0,
	0xf2, 0x9b, 0x22, 0x52, 0x60, 0x60, 0x5e, 0xdf, 0x71, 0xb7, 0xaa, 0x97, 0x91, 0x1a, 0xe5, 0xfc,
	0xd6, 0x45, 0x68, 0xb2, 0x85, 0xc7, 0x58, 0x73, 0x7b, 0x79, 0x06, 0xeb, 0x4f, 0xdc, 0x8b, 0xe6,
	0xf7, 0x32, 0xac, 0xd6, 0x77, 0x8c, 0xf5, 0xb6, 0x7d, 0x94, 0xa3, 0xe7, 0x0d, 0x39, 0xad, 0x14,
	0x8b, 0xf0, 0x61, 0x86, 0x70, 0x1a, 0x19, 0x49, 0xcd, 0xc1, 0xf0, 0xbf, 0x40, 0xe8, 0xcd, 0x45,
	0xf8, 0x4b, 0x17, 0xa1, 0xc9, 0xf5, 0x30, 0x46, 0x98, 0xbb, 0x30, 0xbc, 0x05, 0x63, 0x53, 0xfd,
	0xbe, 0x7b, 0xd1, 0x3c, 0x1d, 0x83, 0xb5, 0xc7, 0xc6, 0x60, 0xbd, 0x23, 0x10, 0x03, 0xca, 0x80,
	0xa9, 0x78, 0x48, 0xc2, 0x69, 0x93, 0x7f, 0x70, 0xc7, 0x42, 0xbd, 0x3d, 0x0f, 0xaa, 0x75, 0x0d,
	0xfd, 0xc5, 0x70, 0xd6, 0xb6, 0x16, 0x0c, 0x3b, 0xfe, 0x4e, 0x11, 0xdd, 0x9a, 0x5a, 0xd9, 0x01,
	0x9d, 0x5d, 0xd9, 0x78, 0x73, 0x5a, 0xad, 0x57, 0x6d, 0x75, 0x6f, 0xfe, 0xf2, 0xae, 0xfe, 0xa8,
	0x70, 0xd1, 0xfc, 0xd3, 0xb8, 0xbb, 0x1b, 0x99, 0x92, 0xb5, 0x72, 0xa7, 0x56, 0x39, 0xd1, 0xab,
	0x9c, 0x50, 0x35, 0xa6, 0xe2, 0x78, 0x56, 0xe3, 0x8b, 0x3d, 0x73, 0xca, 0xcf, 0xb9, 0x8a, 0xd1,
	0xd0, 0xfa, 0x07, 0xcf, 0xec, 0x40, 0x3c, 0x41, 0xeb, 0x97, 0x8a, 0x5c, 0x30, 0x1b, 0xeb, 0xe8,
	0x8e, 0xf7, 0xc9, 0xbc, 0x72, 0x2e, 0x1d, 0x5e, 0xcc, 0x3a, 0xd1, 0x63, 0x72, 0x6b, 0x42, 0xfc,
	0x54, 0x69, 0xf7, 0x75, 0x69, 0x53, 0xb2, 0xf2, 0x8a, 0xcf, 0x0b, 0xce, 0xee, 0x0f, 0x4b, 0x17,
	0xcd, 0xbf, 0x2c, 0xa3, 0x62, 0xc3, 0xaf, 0xe3, 0x43, 0x54, 0x36, 0x9d, 0x6e, 0x1e, 0xb5, 0xf0,
	0xe7, 0x8e, 0x04, 0x3f, 0x8b, 0x42, 0x90, 0xa3, 0x42, 0x47, 0xa0, 0x69, 0x48, 0x78, 0x02, 0xc2,
	0x7e, 0x70, 0x10, 0xce, 0x26, 0x17, 0xd0, 0x78, 0x0f, 0xfa, 0x8d, 0xe5, 0x6d, 0xbf, 0xee, 0xd7,
	0xb7, 0xdc, 0x42, 0x63, 0x8d, 0x26, 0x49, 0x1c, 0xd9, 0x06, 0xd7, 0xbe, 0x2a, 0x39, 0xdb, 0xc9,
	0xbd, 0x69, 0x7f, 0xf0, 0xdd, 0xda, 0x7e, 0x1d, 0x15, 0x3f, 0x53, 0xaf, 0xe3, 0x57, 0xd1, 0x17,
	0x67, 0x8f, 0x50, 0x46, 0x52, 0x06, 0x6f, 0x27, 0x10, 0x68, 0x62, 0x41, 0x08, 0x2e, 0x08, 0x0f,
	0x82, 0x54, 0x40, 0x38, 0x2e, 0x55, 0x82, 0x38, 0x03, 0x41, 0x64, 0x14, 0x82, 0xdf, 0x3e, 0xd1,
	0xa9, 0xeb, 0xf8, 0x2b, 0xe8, 0xcb, 0xf3, 0x52, 0xdb, 0xad, 0xdd, 0xe1, 0xe1, 0x50, 0xa7, 0x1f,
	0xd0, 0xd8, 0x2e, 0x01, 0x1d, 0x9a, 0x0b, 0x12, 0x72, 0xb0, 0x35, 0x0d, 0xa8, 0x0a, 0xfa, 0xe6,
	0x48, 0x96, 0x79, 0x74, 0xd6, 0x6f, 0x1f, 0xea, 0x04, 0xdb, 0xf8, 0x35, 0xb4, 0xb7, 0x38, 0x41,
	0x16, 0x28, 0xe0, 0x4c, 0xd1, 0x88, 0x49, 0x63, 0x4d, 0x25, 0x88, 0x0d, 0xc3, 0xbd, 0xf9, 0x4e,
	0xa0, 0xb1, 0xf4, 0xdb, 0x47, 0x3a, 0xda, 0x03, 0xdc, 0x42, 0x8f, 0xf2, 0xd1, 0xb4, 0xff, 0x24,
	0x54, 0x9f, 0x9e, 0x01, 0x49, 0x40, 0x0c, 0x22, 0x29, 0x8d, 0x28, 0x39, 0xa1, 0x46, 0x65, 0x33,
	0xac, 0xfa, 0x6f, 0xfd, 0xdd, 0x45, 0x7f, 0x75, 0x33, 0x21, 0xfd, 0xd1, 0x2d, 0x17, 0xf1, 0x37,
	0x9b, 0x23, 0x47, 0x3e, 0xdb, 0x56, 0xa9, 0x49, 0x10, 0x20, 0x95, 0x88, 0x0c, 0x46, 0x1d, 0x32,
	0x55, 0x7d, 0x5d, 0x5c, 0x60, 0x74, 0xac, 0x2b, 0x90, 0x3e, 0x79, 0xda, 0x87, 0x69, 0x83, 0xce,
	0x9e, 0x08, 0x6e, 0x42, 0x76, 0x79, 0x1c, 0xf3, 0x73, 0x5b, 0x83, 0xce, 0xc8, 0x45, 0xf4, 0x8e,
	0xf5, 0xd0, 0xdf, 0x16, 0xa4, 0x1b, 0xf3, 0x73, 0x7f, 0x73, 0xa9, 0x51, 0xd6, 0xea, 0xd5, 0x21,
	0x76, 0xcc, 0x32, 0x54, 0xfc, 0x14, 0xd8, 0xee, 0x11, 0xda, 0x18, 0xc9, 0x1c, 0xbf, 0xd4, 0x57,
	0x2a, 0x91, 0x3b, 0x35, 0xe3, 0xe3, 0x77, 0xd8, 0xa9, 0xaf, 0xb8, 0x51, 0xbb, 0x7f, 0xae, 0xed,
	0x68, 0xdd, 0x5e, 0x8e, 0xf8, 0x13, 0x0b, 0xfd, 0xb4, 0x8c, 0x1f, 0xbb, 0x47, 0xce, 0x5b, 0xe6,
	0x9f, 0xf0, 0x6f, 0xb9, 0xce, 0x73, 0xd7, 0x79, 0xd7, 0x75, 0xde, 0x77, 0x9d, 0xdf, 0xb8, 0xce,
	0xdf, 0x5c, 0xe7, 0x57, 0x05, 0xa7, 0x53, 0x32, 0x3b, 0xf4, 0xc1, 0x3f, 0x03, 0x00, 0x00, 0xff,
	0xff, 0xc0, 0x3c, 0x8f, 0x8a, 0xd0, 0x0f, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// BankServiceClient is the client API for BankService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type BankServiceClient interface {
	// GetBank retrieves the details of a specific bank information, selected by its ID.
	GetBank(ctx context.Context, in *GetBankRequest, opts ...grpc.CallOption) (*Bank, error)
	// GetBanks get all the available bank.
	GetBanks(ctx context.Context, in *empty.Empty, opts ...grpc.CallOption) (*GetBanksResponse, error)
	// CreateBank creates a new bank and returns its bank response.
	CreateBank(ctx context.Context, in *CreateBankRequest, opts ...grpc.CallOption) (*Bank, error)
	// UpdateBank updates a bank.
	UpdateBank(ctx context.Context, in *UpdateBankRequest, opts ...grpc.CallOption) (*Bank, error)
	// DeleteBank deletes a bank.
	DeleteBank(ctx context.Context, in *DeleteBankRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	// CreateTransactionTypeAtBank creates a new transaction type at a bank and
	//returns its transaction type response.
	CreateTranscationTypeAtBank(ctx context.Context, in *CreateTransactionTypeAtBankRequest, opts ...grpc.CallOption) (*TransactionType, error)
}

type bankServiceClient struct {
	cc *grpc.ClientConn
}

func NewBankServiceClient(cc *grpc.ClientConn) BankServiceClient {
	return &bankServiceClient{cc}
}

func (c *bankServiceClient) GetBank(ctx context.Context, in *GetBankRequest, opts ...grpc.CallOption) (*Bank, error) {
	out := new(Bank)
	err := c.cc.Invoke(ctx, "/bank.BankService/GetBank", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *bankServiceClient) GetBanks(ctx context.Context, in *empty.Empty, opts ...grpc.CallOption) (*GetBanksResponse, error) {
	out := new(GetBanksResponse)
	err := c.cc.Invoke(ctx, "/bank.BankService/GetBanks", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *bankServiceClient) CreateBank(ctx context.Context, in *CreateBankRequest, opts ...grpc.CallOption) (*Bank, error) {
	out := new(Bank)
	err := c.cc.Invoke(ctx, "/bank.BankService/CreateBank", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *bankServiceClient) UpdateBank(ctx context.Context, in *UpdateBankRequest, opts ...grpc.CallOption) (*Bank, error) {
	out := new(Bank)
	err := c.cc.Invoke(ctx, "/bank.BankService/UpdateBank", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *bankServiceClient) DeleteBank(ctx context.Context, in *DeleteBankRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/bank.BankService/DeleteBank", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *bankServiceClient) CreateTranscationTypeAtBank(ctx context.Context, in *CreateTransactionTypeAtBankRequest, opts ...grpc.CallOption) (*TransactionType, error) {
	out := new(TransactionType)
	err := c.cc.Invoke(ctx, "/bank.BankService/CreateTranscationTypeAtBank", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// BankServiceServer is the server API for BankService service.
type BankServiceServer interface {
	// GetBank retrieves the details of a specific bank information, selected by its ID.
	GetBank(context.Context, *GetBankRequest) (*Bank, error)
	// GetBanks get all the available bank.
	GetBanks(context.Context, *empty.Empty) (*GetBanksResponse, error)
	// CreateBank creates a new bank and returns its bank response.
	CreateBank(context.Context, *CreateBankRequest) (*Bank, error)
	// UpdateBank updates a bank.
	UpdateBank(context.Context, *UpdateBankRequest) (*Bank, error)
	// DeleteBank deletes a bank.
	DeleteBank(context.Context, *DeleteBankRequest) (*empty.Empty, error)
	// CreateTransactionTypeAtBank creates a new transaction type at a bank and
	//returns its transaction type response.
	CreateTranscationTypeAtBank(context.Context, *CreateTransactionTypeAtBankRequest) (*TransactionType, error)
}

// UnimplementedBankServiceServer can be embedded to have forward compatible implementations.
type UnimplementedBankServiceServer struct {
}

func (*UnimplementedBankServiceServer) GetBank(ctx context.Context, req *GetBankRequest) (*Bank, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetBank not implemented")
}
func (*UnimplementedBankServiceServer) GetBanks(ctx context.Context, req *empty.Empty) (*GetBanksResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetBanks not implemented")
}
func (*UnimplementedBankServiceServer) CreateBank(ctx context.Context, req *CreateBankRequest) (*Bank, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateBank not implemented")
}
func (*UnimplementedBankServiceServer) UpdateBank(ctx context.Context, req *UpdateBankRequest) (*Bank, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateBank not implemented")
}
func (*UnimplementedBankServiceServer) DeleteBank(ctx context.Context, req *DeleteBankRequest) (*empty.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteBank not implemented")
}
func (*UnimplementedBankServiceServer) CreateTranscationTypeAtBank(ctx context.Context, req *CreateTransactionTypeAtBankRequest) (*TransactionType, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateTranscationTypeAtBank not implemented")
}

func RegisterBankServiceServer(s *grpc.Server, srv BankServiceServer) {
	s.RegisterService(&_BankService_serviceDesc, srv)
}

func _BankService_GetBank_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetBankRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BankServiceServer).GetBank(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/bank.BankService/GetBank",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BankServiceServer).GetBank(ctx, req.(*GetBankRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _BankService_GetBanks_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(empty.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BankServiceServer).GetBanks(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/bank.BankService/GetBanks",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BankServiceServer).GetBanks(ctx, req.(*empty.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

func _BankService_CreateBank_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateBankRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BankServiceServer).CreateBank(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/bank.BankService/CreateBank",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BankServiceServer).CreateBank(ctx, req.(*CreateBankRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _BankService_UpdateBank_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateBankRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BankServiceServer).UpdateBank(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/bank.BankService/UpdateBank",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BankServiceServer).UpdateBank(ctx, req.(*UpdateBankRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _BankService_DeleteBank_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteBankRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BankServiceServer).DeleteBank(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/bank.BankService/DeleteBank",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BankServiceServer).DeleteBank(ctx, req.(*DeleteBankRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _BankService_CreateTranscationTypeAtBank_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateTransactionTypeAtBankRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BankServiceServer).CreateTranscationTypeAtBank(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/bank.BankService/CreateTranscationTypeAtBank",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BankServiceServer).CreateTranscationTypeAtBank(ctx, req.(*CreateTransactionTypeAtBankRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _BankService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "bank.BankService",
	HandlerType: (*BankServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetBank",
			Handler:    _BankService_GetBank_Handler,
		},
		{
			MethodName: "GetBanks",
			Handler:    _BankService_GetBanks_Handler,
		},
		{
			MethodName: "CreateBank",
			Handler:    _BankService_CreateBank_Handler,
		},
		{
			MethodName: "UpdateBank",
			Handler:    _BankService_UpdateBank_Handler,
		},
		{
			MethodName: "DeleteBank",
			Handler:    _BankService_DeleteBank_Handler,
		},
		{
			MethodName: "CreateTranscationTypeAtBank",
			Handler:    _BankService_CreateTranscationTypeAtBank_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "github.com/openbank/openbank/v1/bank/all.proto",
}
