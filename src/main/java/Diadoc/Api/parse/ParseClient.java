package Diadoc.Api.parse;

import Diadoc.Api.exceptions.DiadocSdkException;
import com.google.protobuf.InvalidProtocolBufferException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URISyntaxException;

import static Diadoc.Api.Proto.Invoicing.AcceptanceCertificate552InfoProtos.*;
import static Diadoc.Api.Proto.Invoicing.AcceptanceCertificateInfoProtos.*;
import static Diadoc.Api.Proto.Invoicing.InvoiceInfoProtos.*;
import static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.*;
import static Diadoc.Api.Proto.Invoicing.SignatureRejectionInfoProtos.*;
import static Diadoc.Api.Proto.Invoicing.Torg12InfoProtos.*;
import static Diadoc.Api.Proto.Invoicing.TovTorgInfoProtos.*;
import static Diadoc.Api.Proto.Invoicing.UniversalTransferDocumentInfoProtos.*;

public class ParseClient {
    private DiadocHttpClient diadocHttpClient;

    public ParseClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public InvoiceInfo parseInvoiceXml(byte[] invoiceXmlContent) throws DiadocSdkException {
        try {
            return InvoiceInfo.parseFrom(parseXml(invoiceXmlContent, "/ParseInvoiceXml", null));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public Torg12SellerTitleInfo parseTorg12SellerTitleXml(byte[] sellerTitleXmlContent) throws DiadocSdkException {
        try {
            return Torg12SellerTitleInfo.parseFrom(parseXml(sellerTitleXmlContent, "/ParseTorg12SellerTitleXml", null));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public Torg12BuyerTitleInfo parseTorg12BuyerTitleXml(byte[] buyerTitleXmlContent) throws DiadocSdkException {
        try {
            return Torg12BuyerTitleInfo.parseFrom(parseXml(buyerTitleXmlContent, "/ParseTorg12BuyerTitleXml", null));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public TovTorgSellerTitleInfo parseTovTorg551SellerTitleXml(byte[] sellerTitleXmlContent) throws DiadocSdkException {
        try {
            return TovTorgSellerTitleInfo.parseFrom(parseXml(sellerTitleXmlContent, "/ParseTorg12SellerTitleXml", "tovtorg_05_01_04"));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public TovTorgBuyerTitleInfo parseTovTorg551BuyerTitleXml(byte[] buyerTitleXmlContent) throws DiadocSdkException {
        try {
            return TovTorgBuyerTitleInfo.parseFrom(parseXml(buyerTitleXmlContent, "/ParseTorg12BuyerTitleXml", "tovtorg_05_01_04"));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public AcceptanceCertificateSellerTitleInfo parseAcceptanceCertificateSellerTitleXml(byte[] sellerTitleXmlContent) throws DiadocSdkException {
        try {
            return AcceptanceCertificateSellerTitleInfo.parseFrom(parseXml(
                    sellerTitleXmlContent,
                    "/ParseAcceptanceCertificateSellerTitleXml",
                    null));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public AcceptanceCertificateBuyerTitleInfo parseAcceptanceCertificateBuyerTitleXml(byte[] buyerTitleXmlContent) throws DiadocSdkException {
        try {
            return AcceptanceCertificateBuyerTitleInfo.parseFrom(parseXml(
                    buyerTitleXmlContent,
                    "/ParseAcceptanceCertificateBuyerTitleXml",
                    null));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public AcceptanceCertificate552SellerTitleInfo parseAcceptanceCertificate552SellerTitleXml(byte[] sellerTitleXmlContent) throws DiadocSdkException {
        try {
            return AcceptanceCertificate552SellerTitleInfo.parseFrom(parseXml(
                    sellerTitleXmlContent,
                    "/ParseAcceptanceCertificateSellerTitleXml",
                    "rezru_05_01_02"));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public AcceptanceCertificate552BuyerTitleInfo parseAcceptanceCertificate552BuyerTitleXml(byte[] buyerTitleXmlContent) throws DiadocSdkException {
        try {
            return AcceptanceCertificate552BuyerTitleInfo.parseFrom(parseXml(
                    buyerTitleXmlContent,
                    "/ParseAcceptanceCertificateBuyerTitleXml",
                    "rezru_05_01_02"));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public UniversalTransferDocumentSellerTitleInfo parseUniversalTransferDocumentSellerTitleXml(byte[] utdXmlContent) throws DiadocSdkException {
        return parseUniversalTransferDocumentSellerTitleXml(utdXmlContent, "utd_05_01_05");
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public UniversalTransferDocumentSellerTitleInfo parseUniversalTransferDocumentSellerTitleXml(byte[] utdXmlContent, String documentVersion)
            throws DiadocSdkException {
        try {
            return UniversalTransferDocumentSellerTitleInfo.parseFrom(parseXml(
                    utdXmlContent,
                    "/ParseUniversalTransferDocumentSellerTitleXml",
                    documentVersion));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public UniversalTransferDocumentBuyerTitleInfo parseUniversalTransferDocumentBuyerTitleXml(byte[] utdXmlContent) throws DiadocSdkException {
        try {
            return UniversalTransferDocumentBuyerTitleInfo.parseFrom(parseXml(
                    utdXmlContent,
                    "/ParseUniversalTransferDocumentBuyerTitleXml",
                    null));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public UniversalCorrectionDocumentSellerTitleInfo parseUniversalCorrectionDocumentSellerTitleXml(byte[] utdXmlContent) throws DiadocSdkException {
        return parseUniversalCorrectionDocumentSellerTitleXml(utdXmlContent, "ucd_05_01_03");
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public UniversalCorrectionDocumentSellerTitleInfo parseUniversalCorrectionDocumentSellerTitleXml(byte[] utdXmlContent, String documentVersion) throws
            DiadocSdkException {
        try {
            return UniversalCorrectionDocumentSellerTitleInfo.parseFrom(parseXml(
                    utdXmlContent,
                    "/ParseUniversalCorrectionDocumentSellerTitleXml",
                    documentVersion));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #parseTitleXml(String, String, String, String, Integer, byte[])}
     */
    @Deprecated
    public UniversalTransferDocumentBuyerTitleInfo parseUniversalCorrectionDocumentBuyerTitleXml(byte[] utdXmlContent) throws DiadocSdkException {
        try {
            return UniversalTransferDocumentBuyerTitleInfo.parseFrom(parseXml(
                    utdXmlContent,
                    "/ParseUniversalCorrectionDocumentBuyerTitleXml",
                    null));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    public RevocationRequestInfo parseRevocationRequestXml(byte[] xmlContent) throws DiadocSdkException {
        try {
            return RevocationRequestInfo.parseFrom(parseXml(
                    xmlContent,
                    "/ParseRevocationRequestXml",
                    null));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    public SignatureRejectionInfo parseSignatureRejectionXml(byte[] xmlContent) throws DiadocSdkException {

        try {
            return SignatureRejectionInfo.parseFrom(parseXml(
                    xmlContent,
                    "/ParseSignatureRejectionXml",
                    null));
        } catch (InvalidProtocolBufferException e) {
            throw new DiadocSdkException(e);
        }
    }

    public byte[] parseTitleXml(String boxId, String documentTypeNamedId, String documentFunction, String documentVersion, Integer titleIndex, byte[] content) throws DiadocSdkException {
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/ParseTitleXml")
                            .addParameter("boxId", boxId)
                            .addParameter("documentTypeNamedId", documentTypeNamedId)
                            .addParameter("documentFunction", documentFunction)
                            .addParameter("documentVersion", documentVersion)
                            .addParameter("titleIndex", titleIndex.toString()).build())
                    .setEntity(new ByteArrayEntity(content));

            return diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    private byte[] parseXml(byte[] xmlContent, String path, @Nullable String documentVersion) throws DiadocSdkException {
        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl()).setPath(path);

            if (documentVersion != null) {
                url.addParameter("documentVersion", documentVersion);
            }

            var request = RequestBuilder.post(
                    url.build())
                    .setEntity(new ByteArrayEntity(xmlContent));

            return diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
