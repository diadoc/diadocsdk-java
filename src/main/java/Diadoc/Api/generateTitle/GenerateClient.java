package Diadoc.Api.generateTitle;

import Diadoc.Api.Proto.Invoicing.TovTorgInfoProtos;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import Diadoc.Api.httpClient.GeneratedFile;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.MessageLite;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

import javax.mail.internet.ParseException;
import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.Invoicing.AcceptanceCertificate552InfoProtos.AcceptanceCertificate552BuyerTitleInfo;
import static Diadoc.Api.Proto.Invoicing.AcceptanceCertificate552InfoProtos.AcceptanceCertificate552SellerTitleInfo;
import static Diadoc.Api.Proto.Invoicing.AcceptanceCertificateInfoProtos.AcceptanceCertificateBuyerTitleInfo;
import static Diadoc.Api.Proto.Invoicing.AcceptanceCertificateInfoProtos.AcceptanceCertificateSellerTitleInfo;
import static Diadoc.Api.Proto.Invoicing.InvoiceCorrectionRequestInfoProtos.InvoiceCorrectionRequestInfo;
import static Diadoc.Api.Proto.Invoicing.InvoiceInfoProtos.InvoiceCorrectionInfo;
import static Diadoc.Api.Proto.Invoicing.InvoiceInfoProtos.InvoiceInfo;
import static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo;
import static Diadoc.Api.Proto.Invoicing.SignatureRejectionInfoProtos.SignatureRejectionInfo;
import static Diadoc.Api.Proto.Invoicing.SignatureRejectionInfoProtos.SignatureRejectionGenerationRequestV2;
import static Diadoc.Api.Proto.Invoicing.InvoiceCorrectionRequestInfoProtos.InvoiceCorrectionRequestGenerationRequestV2;
import static Diadoc.Api.Proto.Invoicing.ReceiptGenerationRequestProtos.ReceiptGenerationRequestV2;
import static Diadoc.Api.Proto.Invoicing.SignerProtos.Signer;
import static Diadoc.Api.Proto.Invoicing.Torg12InfoProtos.Torg12BuyerTitleInfo;
import static Diadoc.Api.Proto.Invoicing.Torg12InfoProtos.Torg12SellerTitleInfo;
import static Diadoc.Api.Proto.Invoicing.TovTorgInfoProtos.TovTorgSellerTitleInfo;
import static Diadoc.Api.Proto.Invoicing.UniversalTransferDocumentInfoProtos.*;

public class GenerateClient {
    private DiadocHttpClient diadocHttpClient;

    public GenerateClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public GeneratedFile generateInvoiceCorrectionRequestXml(String boxId,
                                                             String messageId,
                                                             String attachmentId,
                                                             InvoiceCorrectionRequestInfo invoiceCorrectionInfo) throws DiadocSdkException {
        return getGeneratedXml(boxId, messageId, attachmentId, "/GenerateInvoiceCorrectionRequestXml", invoiceCorrectionInfo);
    }

    public GeneratedFile generateInvoiceCorrectionRequestXmlV2(String boxId,
                                                               InvoiceCorrectionRequestGenerationRequestV2 generationRequest) throws DiadocSdkException {
        return getGeneratedXml(boxId, "/V2/GenerateInvoiceCorrectionRequestXml", generationRequest);
    }
    public GeneratedFile generateRevocationRequestXml(String boxId,
                                                      String messageId,
                                                      String attachmentId,
                                                      RevocationRequestInfo revocationRequestInfo) throws DiadocSdkException {
        return generateRevocationRequestXml(boxId, messageId, attachmentId, revocationRequestInfo, null);
    }

    public GeneratedFile generateRevocationRequestXml(String boxId,
                                                      String messageId,
                                                      String attachmentId,
                                                      RevocationRequestInfo revocationRequestInfo,
                                                      @Nullable String contentTypeId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }
        if (attachmentId == null) {
            throw new IllegalArgumentException("attachmentId");
        }

        try {
            var uriBuilder = new URIBuilder(diadocHttpClient.getBaseUrl())
                .setPath("/V2/GenerateRevocationRequestXml")
                .addParameter("boxId", boxId)
                .addParameter("messageId", messageId)
                .addParameter("attachmentId", attachmentId);
            if(contentTypeId != null) {
                uriBuilder.addParameter("contentTypeId", contentTypeId);
            }
            var request = RequestBuilder.post(uriBuilder.build())
                    .setEntity(new ByteArrayEntity(revocationRequestInfo.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateSignatureRejectionXml(String boxId,
                                                       String messageId,
                                                       String attachmentId,
                                                       SignatureRejectionInfo signatureRejectionInfo) throws DiadocSdkException {
        return getGeneratedXml(boxId, messageId, attachmentId, "/GenerateSignatureRejectionXml", signatureRejectionInfo);
    }

    public GeneratedFile generateSignatureRejectionXmlV2(String boxId,
                                                       SignatureRejectionGenerationRequestV2 generationRequest) throws DiadocSdkException {
        return getGeneratedXml(boxId, "/V2/GenerateSignatureRejectionXml", generationRequest);
    }

    public GeneratedFile generateReceiptXml(String boxId, String messageId, String attachmentId, Signer signer) throws DiadocSdkException {
        return getGeneratedXml(boxId, messageId, attachmentId, "/GenerateReceiptXml", signer);
    }

    public GeneratedFile generateReceiptXmlV2(String boxId, ReceiptGenerationRequestV2 generationRequest) throws DiadocSdkException {
        return getGeneratedXml(boxId, "/V2/GenerateReceiptXml", generationRequest);
    }

    private <T extends GeneratedMessage> GeneratedFile getGeneratedXml(
            String boxId,
            String messageId,
            String attachmentId,
            String path,
            T data) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }
        if (attachmentId == null) {
            throw new IllegalArgumentException("attachmentId");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath(path)
                            .addParameter("boxId", boxId)
                            .addParameter("messageId", messageId)
                            .addParameter("attachmentId", attachmentId)
                            .build())
                    .setEntity(new ByteArrayEntity(data.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    private <T extends GeneratedMessage> GeneratedFile getGeneratedXml(
            String boxId,
            String path,
            T data) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath(path)
                            .addParameter("boxId", boxId)
                            .build())
                    .setEntity(new ByteArrayEntity(data.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateInvoiceXml(InvoiceInfo invoiceInfo) throws DiadocSdkException {
        return generateInvoiceXml(invoiceInfo, "Invoice", false);
    }

    public GeneratedFile generateInvoiceXml(InvoiceInfo invoiceInfo, boolean disableValidation) throws DiadocSdkException {
        return generateInvoiceXml(invoiceInfo, "Invoice", disableValidation);
    }

    public GeneratedFile generateInvoiceRevisionXml(InvoiceInfo invoiceRevisionInfo) throws DiadocSdkException {
        return generateInvoiceXml(invoiceRevisionInfo, "InvoiceRevision", false);
    }

    public GeneratedFile generateInvoiceRevisionXml(InvoiceInfo invoiceRevisionInfo, boolean disableValidation) throws DiadocSdkException {
        return generateInvoiceXml(invoiceRevisionInfo, "InvoiceRevision", disableValidation);
    }

    public GeneratedFile generateInvoiceCorrectionXml(InvoiceCorrectionInfo invoiceCorrectionInfo) throws DiadocSdkException {
        return generateInvoiceXml(invoiceCorrectionInfo, "InvoiceCorrection", false);
    }

    public GeneratedFile generateInvoiceCorrectionXml(InvoiceCorrectionInfo invoiceCorrectionInfo, boolean disableValidation) throws DiadocSdkException {
        return generateInvoiceXml(invoiceCorrectionInfo, "InvoiceCorrection", disableValidation);
    }

    public GeneratedFile generateInvoiceCorrectionRevisionXml(InvoiceCorrectionInfo invoiceCorrectionRevisionInfo) throws DiadocSdkException {
        return generateInvoiceXml(invoiceCorrectionRevisionInfo, "InvoiceCorrectionRevision", false);
    }

    public GeneratedFile generateInvoiceCorrectionRevisionXml(InvoiceCorrectionInfo invoiceCorrectionRevisionInfo, boolean disableValidation) throws DiadocSdkException {
        return generateInvoiceXml(invoiceCorrectionRevisionInfo, "InvoiceCorrectionRevision", disableValidation);
    }

    private GeneratedFile generateInvoiceXml(MessageLite invoiceInfo, String invoiceType, boolean disableValidation) throws DiadocSdkException {
        if (invoiceInfo == null) {
            throw new IllegalArgumentException("info");
        }
        try {

            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GenerateInvoiceXml")
                            .addParameter("invoiceType", invoiceType)
                            .addParameter("disableValidation", String.valueOf(disableValidation)).build())
                    .setEntity(new ByteArrayEntity(invoiceInfo.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateTitleXml(
            String boxId,
            String documentTypeNamedId,
            String documentFunction,
            String documentVersion,
            Integer titleIndex,
            byte[] userContractData,
            @Nullable String editingSettingId,
            boolean disableValidation,
            @Nullable String letterId,
            @Nullable String documentId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (documentTypeNamedId == null) {
            throw new IllegalArgumentException("documentTypeNamedId");
        }
        if (documentFunction == null) {
            throw new IllegalArgumentException("documentFunction");
        }
        if (documentVersion == null) {
            throw new IllegalArgumentException("documentVersion");
        }
        if (userContractData == null) {
            throw new IllegalArgumentException("userContractData");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GenerateTitleXml")
                            .addParameter("boxId", boxId)
                            .addParameter("documentTypeNamedId", documentTypeNamedId)
                            .addParameter("documentFunction", documentFunction)
                            .addParameter("documentVersion", documentVersion)
                            .addParameter("titleIndex", titleIndex.toString())
                            .addParameter("disableValidation", Boolean.toString(disableValidation))
                            .addParameter("editingSettingId", editingSettingId)
                            .addParameter("letterId", letterId)
                            .addParameter("documentId", documentId).build())
                    .setEntity(new ByteArrayEntity(userContractData));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateTitleXml(
            String boxId,
            String documentTypeNamedId,
            String documentFunction,
            String documentVersion,
            Integer titleIndex,
            byte[] userContractData,
            String editingSettingId,
            boolean disableValidation) throws DiadocSdkException {
        return generateTitleXml(
                boxId,
                documentTypeNamedId,
                documentFunction,
                documentVersion,
                titleIndex,
                userContractData,
                editingSettingId,
                disableValidation,
                null,
                null);
    }

    public GeneratedFile generateTitleXml(
            String boxId,
            String documentTypeNamedId,
            String documentFunction,
            String documentVersion,
            Integer titleIndex,
            byte[] userContractData,
            String letterId,
            String documentId) throws DiadocSdkException {
        return generateTitleXml(
                boxId,
                documentTypeNamedId,
                documentFunction,
                documentVersion,
                titleIndex,
                userContractData,
                null,
                false,
                letterId,
                documentId);
    }

    public GeneratedFile generateSenderTitleXml(
            String boxId,
            String documentTypeNamedId,
            String documentFunction,
            String documentVersion,
            byte[] userContractData,
            @Nullable String editingSettingId,
            boolean disableValidation) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (documentTypeNamedId == null) {
            throw new IllegalArgumentException("documentTypeNamedId");
        }
        if (documentFunction == null) {
            throw new IllegalArgumentException("documentFunction");
        }
        if (documentVersion == null) {
            throw new IllegalArgumentException("documentVersion");
        }
        if (userContractData == null) {
            throw new IllegalArgumentException("userContractData");
        }

        try {

            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GenerateSenderTitleXml")
                            .addParameter("boxId", boxId)
                            .addParameter("documentTypeNamedId", documentTypeNamedId)
                            .addParameter("documentFunction", documentFunction)
                            .addParameter("documentVersion", documentVersion)
                            .addParameter("disableValidation", Boolean.toString(disableValidation))
                            .addParameter("editingSettingId", editingSettingId).build())
                    .setEntity(new ByteArrayEntity(userContractData));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateSenderTitleXml(
            String boxId,
            String documentTypeNamedId,
            String documentFunction,
            String documentVersion,
            byte[] userContractData) throws DiadocSdkException {
        return generateSenderTitleXml(
                boxId,
                documentTypeNamedId,
                documentFunction,
                documentVersion,
                userContractData,
                null,
                false);
    }

    public GeneratedFile generateRecipientTitleXml(
            String boxId,
            String senderTitleMessageId,
            String senderTitleAttachmentId,
            byte[] userContractData,
            @Nullable String documentVersion
    ) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (senderTitleMessageId == null) {
            throw new IllegalArgumentException("senderTitleMessageId");
        }
        if (senderTitleAttachmentId == null) {
            throw new IllegalArgumentException("senderTitleAttachmentId");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GenerateRecipientTitleXml")
                            .addParameter("boxId", boxId)
                            .addParameter("senderTitleMessageId", senderTitleMessageId)
                            .addParameter("senderTitleAttachmentId", senderTitleAttachmentId)
                            .addParameter("documentVersion", documentVersion).build())
                    .setEntity(new ByteArrayEntity(userContractData));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateRecipientTitleXml(
            String boxId,
            String senderTitleMessageId,
            String senderTitleAttachmentId,
            byte[] userContractData
    ) throws DiadocSdkException {
        return generateRecipientTitleXml(boxId, senderTitleMessageId, senderTitleAttachmentId, userContractData, null);
    }

    private <T extends GeneratedMessage> GeneratedFile generateTorgXmlForSeller(
            T sellerTitleInfo,
            boolean disableValidation,
            @Nullable String documentVersion) throws DiadocSdkException {
        if (sellerTitleInfo == null) {
            throw new IllegalArgumentException("sellerTitleInfo");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GenerateTorg12XmlForSeller")
                            .addParameter("disableValidation", String.valueOf(disableValidation))
                            .addParameter("documentVersion", documentVersion)
                            .build())
                    .setEntity(new ByteArrayEntity(sellerTitleInfo.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateTorg12XmlForSeller(Torg12SellerTitleInfo sellerTitleInfo) throws DiadocSdkException {
        return generateTorgXmlForSeller(sellerTitleInfo, false, null);
    }

    public GeneratedFile generateTorg12XmlForSeller(Torg12SellerTitleInfo sellerTitleInfo, boolean disableValidation) throws DiadocSdkException {
        return generateTorgXmlForSeller(sellerTitleInfo, disableValidation, null);
    }

    public GeneratedFile generateTovTorg551XmlForSeller(TovTorgSellerTitleInfo sellerTitleInfo, boolean disableValidation) throws DiadocSdkException {
        return generateTorgXmlForSeller(sellerTitleInfo, disableValidation, "tovtorg_05_01_04");
    }

    public GeneratedFile generateTovTorg551XmlForSeller(TovTorgInfoProtos.TovTorgSellerTitleInfo sellerTitleInfo) throws DiadocSdkException {
        return generateTovTorg551XmlForSeller(sellerTitleInfo, false);
    }

    public GeneratedFile generateTorg12XmlForBuyer(
            Torg12BuyerTitleInfo buyerTitleInfo,
            String boxId,
            String sellerTitleMessageId,
            String sellerTitleAttachmentId) throws DiadocSdkException {
        return generateTorgXmlForBuyer(buyerTitleInfo, boxId, sellerTitleMessageId, sellerTitleAttachmentId, null);
    }

    public GeneratedFile generateTovTorg551XmlForBuyer(
            TovTorgInfoProtos.TovTorgBuyerTitleInfo buyerTitleInfo,
            String boxId,
            String sellerTitleMessageId,
            String sellerTitleAttachmentId,
            String documentVersion) throws DiadocSdkException {

        if (documentVersion == null) {
            throw new IllegalArgumentException("documentVersion");
        }
        return generateTorgXmlForBuyer(buyerTitleInfo, boxId, sellerTitleMessageId, sellerTitleAttachmentId, documentVersion);
    }

    public GeneratedFile generateTovTorg551XmlForBuyer(
            TovTorgInfoProtos.TovTorgBuyerTitleInfo buyerTitleInfo,
            String boxId,
            String sellerTitleMessageId,
            String sellerTitleAttachmentId) throws DiadocSdkException {
        return generateTovTorg551XmlForBuyer(buyerTitleInfo, boxId, sellerTitleMessageId, sellerTitleAttachmentId, "tovtorg_05_01_04");
    }

    private <T extends GeneratedMessage> GeneratedFile generateTorgXmlForBuyer(
            T buyerTitleInfo,
            String boxId,
            String sellerTitleMessageId,
            String sellerTitleAttachmentId,
            @Nullable String documentVersion) throws DiadocSdkException {
        if (buyerTitleInfo == null) {
            throw new IllegalArgumentException("buyerTitleInfo");
        }
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (sellerTitleMessageId == null) {
            throw new IllegalArgumentException("sellerTitleMessageId");
        }
        if (sellerTitleAttachmentId == null) {
            throw new IllegalArgumentException("sellerTitleAttachmentId");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GenerateTorg12XmlForBuyer")
                            .addParameter("boxId", boxId)
                            .addParameter("sellerTitleMessageId", sellerTitleMessageId)
                            .addParameter("sellerTitleAttachmentId", sellerTitleAttachmentId)
                            .addParameter("documentVersion", documentVersion)
                            .build())
                    .setEntity(new ByteArrayEntity(buyerTitleInfo.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateAcceptanceCertificateXmlForSeller(AcceptanceCertificateSellerTitleInfo sellerTitleInfo) throws DiadocSdkException {
        return generateAcceptanceCertificateXmlForSeller(sellerTitleInfo, false, null);
    }

    public GeneratedFile generateAcceptanceCertificateXmlForSeller(AcceptanceCertificateSellerTitleInfo sellerTitleInfo, boolean disableValidation) throws DiadocSdkException {
        return generateAcceptanceCertificateXmlForSeller(sellerTitleInfo, disableValidation, null);
    }

    public GeneratedFile generateAcceptanceCertificate552XmlForSeller(AcceptanceCertificate552SellerTitleInfo sellerTitleInfo, boolean disableValidation) throws DiadocSdkException {
        return generateAcceptanceCertificateXmlForSeller(sellerTitleInfo, disableValidation, "rezru_05_01_02");
    }

    public GeneratedFile generateAcceptanceCertificate552XmlForSeller(AcceptanceCertificate552SellerTitleInfo sellerTitleInfo) throws DiadocSdkException {
        return generateAcceptanceCertificateXmlForSeller(sellerTitleInfo, false, "rezru_05_01_02");
    }

    private <T extends GeneratedMessage> GeneratedFile generateAcceptanceCertificateXmlForSeller(T sellerTitleInfo, boolean disableValidation, @Nullable String documentVersion)
            throws DiadocSdkException {

        if (sellerTitleInfo == null) {
            throw new IllegalArgumentException("sellerTitleInfo");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GenerateAcceptanceCertificateXmlForSeller")
                            .addParameter("disableValidation", String.valueOf(disableValidation))
                            .addParameter("documentVersion", documentVersion)
                            .build())
                    .setEntity(new ByteArrayEntity(sellerTitleInfo.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateAcceptanceCertificateXmlForBuyer(AcceptanceCertificateBuyerTitleInfo buyerTitleInfo,
                                                                  String boxId,
                                                                  String sellerTitleMessageId,
                                                                  String sellerTitleAttachmentId) throws DiadocSdkException {
        return generateAcceptanceCertificateXmlForBuyer(buyerTitleInfo, boxId, sellerTitleMessageId, sellerTitleAttachmentId, null);
    }

    public GeneratedFile generateAcceptanceCertificate552XmlForBuyer(AcceptanceCertificate552BuyerTitleInfo buyerTitleInfo,
                                                                     String boxId,
                                                                     String sellerTitleMessageId,
                                                                     String sellerTitleAttachmentId) throws DiadocSdkException {

        return generateAcceptanceCertificateXmlForBuyer(buyerTitleInfo, boxId, sellerTitleMessageId, sellerTitleAttachmentId, "rezru_05_01_02");
    }


    private <T extends GeneratedMessage> GeneratedFile generateAcceptanceCertificateXmlForBuyer(
            T buyerTitleInfo,
            String boxId,
            String sellerTitleMessageId,
            String sellerTitleAttachmentId,
            @Nullable String documentVersion) throws DiadocSdkException {
        if (buyerTitleInfo == null) {
            throw new IllegalArgumentException("buyerTitleInfo");
        }
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (sellerTitleMessageId == null) {
            throw new IllegalArgumentException("sellerTitleMessageId");
        }
        if (sellerTitleAttachmentId == null) {
            throw new IllegalArgumentException("sellerTitleAttachmentId");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GenerateAcceptanceCertificateXmlForBuyer")
                            .addParameter("boxId", boxId)
                            .addParameter("sellerTitleMessageId", sellerTitleMessageId)
                            .addParameter("sellerTitleAttachmentId", sellerTitleAttachmentId)
                            .addParameter("documentVersion", documentVersion)
                            .build())
                    .setEntity(new ByteArrayEntity(buyerTitleInfo.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateUniversalTransferDocumentXmlForSeller(UniversalTransferDocumentSellerTitleInfo utdInfo) throws DiadocSdkException {
        return generateUniversalTransferDocumentXmlForSeller(utdInfo, false);
    }

    public GeneratedFile generateUniversalTransferDocumentXmlForSeller(UniversalTransferDocumentSellerTitleInfo utdInfo, boolean disableValidation) throws DiadocSdkException {
        return generateUniversalTransferDocumentXmlForSeller(utdInfo, disableValidation, "utd_05_01_05");
    }

    public GeneratedFile generateUniversalTransferDocumentXmlForSeller(UniversalTransferDocumentSellerTitleInfo utdInfo, boolean disableValidation, String documentVersion) throws DiadocSdkException {
        if (utdInfo == null) {
            throw new IllegalArgumentException("info");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GenerateUniversalTransferDocumentXmlForSeller")
                            .addParameter("documentVersion", documentVersion)
                            .addParameter("disableValidation", String.valueOf(disableValidation))
                            .build())
                    .setEntity(new ByteArrayEntity(utdInfo.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateUniversalTransferDocumentXmlForBuyer(
            UniversalTransferDocumentBuyerTitleInfo buyerTitleInfo,
            String boxId,
            String sellerTitleMessageId,
            String sellerTitleAttachmentId
    ) throws DiadocSdkException {
        if (buyerTitleInfo == null) {
            throw new IllegalArgumentException("buyerTitleInfo");
        }
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (sellerTitleMessageId == null) {
            throw new IllegalArgumentException("sellerTitleMessageId");
        }
        if (sellerTitleAttachmentId == null) {
            throw new IllegalArgumentException("sellerTitleAttachmentId");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GenerateUniversalTransferDocumentXmlForBuyer")
                            .addParameter("boxId", boxId)
                            .addParameter("sellerTitleMessageId", sellerTitleMessageId)
                            .addParameter("sellerTitleAttachmentId", sellerTitleAttachmentId)
                            .build())
                    .setEntity(new ByteArrayEntity(buyerTitleInfo.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateUniversalCorrectionTransferDocumentXmlForSeller(
            UniversalCorrectionDocumentSellerTitleInfo ucdInfo,
            boolean disableValidation,
            String documentVersion) throws DiadocSdkException {
        if (ucdInfo == null) {
            throw new IllegalArgumentException("info");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GenerateUniversalTransferDocumentXmlForSeller")
                            .addParameter("correction", null)
                            .addParameter("documentVersion", documentVersion)
                            .addParameter("disableValidation", String.valueOf(disableValidation))
                            .build())
                    .setEntity(new ByteArrayEntity(ucdInfo.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    public GeneratedFile generateUniversalCorrectionTransferDocumentXmlForSeller(UniversalCorrectionDocumentSellerTitleInfo ucdInfo) throws DiadocSdkException {
        return generateUniversalCorrectionTransferDocumentXmlForSeller(ucdInfo, false);
    }

    public GeneratedFile generateUniversalCorrectionTransferDocumentXmlForSeller(UniversalCorrectionDocumentSellerTitleInfo ucdInfo, boolean disableValidation) throws DiadocSdkException {
        return generateUniversalCorrectionTransferDocumentXmlForSeller(ucdInfo, disableValidation, "ucd_05_01_03");
    }

    @Deprecated
    private GeneratedFile generateDocumentReceiptXml(String boxId, String messageId, String attachmentId, Signer signer, String path)
            throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }
        if (attachmentId == null) {
            throw new IllegalArgumentException("attachmentId");
        }
        if (signer == null) {
            throw new IllegalArgumentException("signer");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath(path)
                            .addParameter("boxId", boxId)
                            .addParameter("messageId", messageId)
                            .addParameter("attachmentId", attachmentId)
                            .build())
                    .setEntity(new ByteArrayEntity(signer.toByteArray()));
            return diadocHttpClient.performRequestWithGeneratedFile(request);
        } catch (URISyntaxException | IOException | ParseException e) {
            throw new DiadocSdkException(e);
        }
    }

    @Deprecated
    public GeneratedFile generateInvoiceDocumentReceiptXml(String boxId, String messageId, String attachmentId, Signer signer)
            throws DiadocSdkException {
        return  generateDocumentReceiptXml(boxId, messageId, attachmentId, signer, "/GenerateInvoiceDocumentReceiptXml");
    }

    @Deprecated
    public GeneratedFile generateDocumentReceiptXml(String boxId, String messageId, String attachmentId, Signer signer) throws DiadocSdkException {
        return generateDocumentReceiptXml(boxId, messageId, attachmentId, signer, "/GenerateDocumentReceiptXml");
    }
}
