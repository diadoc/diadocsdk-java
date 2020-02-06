package Diadoc.Api;

import Diadoc.Api.Proto.*;
import Diadoc.Api.Proto.Docflow.DocflowApiProtos;
import Diadoc.Api.Proto.Docflow.DocflowApiV3Protos;
import Diadoc.Api.Proto.Documents.*;
import Diadoc.Api.Proto.Documents.Types.DocumentTypeDescriptionProtos;
import Diadoc.Api.Proto.Departments.*;
import Diadoc.Api.Proto.Dss.DssSignProtos;
import Diadoc.Api.Proto.Employees.EmployeeProtos;
import Diadoc.Api.Proto.Employees.Subscriptions.SubscriptionProtos;
import Diadoc.Api.Proto.Employees.EmployeeToCreateProtos;
import Diadoc.Api.Proto.Employees.EmployeeToUpdateProtos;
import Diadoc.Api.Proto.Events.DiadocMessage_GetApiProtos;
import Diadoc.Api.Proto.Events.DiadocMessage_PostApiProtos;
import Diadoc.Api.Proto.Invoicing.*;
import Diadoc.Api.Proto.Invoicing.Signers.*;
import Diadoc.Api.Proto.Registration.RegistrationRequestProtos;
import Diadoc.Api.Proto.Users.UserToUpdateProtos;
import Diadoc.Api.auth.AuthManager;
import Diadoc.Api.auth.AuthenticateClient;
import Diadoc.Api.counteragent.CounteragentClient;
import Diadoc.Api.department.DepartmentClient;
import Diadoc.Api.docflow.DocflowClient;
import Diadoc.Api.document.DocumentClient;
import Diadoc.Api.document.DocumentsFilter;
import Diadoc.Api.documentType.DocumentTypeClient;
import Diadoc.Api.documentType.XsdContentType;
import Diadoc.Api.employee.EmployeeClient;
import Diadoc.Api.events.EventsClient;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.generateTitle.GenerateClient;
import Diadoc.Api.message.MessageClient;
import Diadoc.Api.organizations.OrganizationClient;
import Diadoc.Api.parse.ParseClient;
import Diadoc.Api.print.models.DocumentProtocolResult;
import Diadoc.Api.print.models.DocumentZipResult;
import Diadoc.Api.print.PrintFormClient;
import Diadoc.Api.print.models.PrintFormResult;
import Diadoc.Api.shelf.ShelfClient;
import Diadoc.Api.sign.SignClient;
import Diadoc.Api.template.TemplateClient;
import Diadoc.Api.user.UserClient;
import Diadoc.Api.httpClient.DiadocHttpClient;
import Diadoc.Api.httpClient.FileContent;
import Diadoc.Api.httpClient.GeneratedFile;
import org.apache.http.HttpHost;
import org.jetbrains.annotations.Nullable;

import javax.mail.internet.ParseException;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.*;

import static Diadoc.Api.Proto.Departments.DepartmentListProtos.*;
import static Diadoc.Api.Proto.Departments.DepartmentToCreateProtos.*;
import static Diadoc.Api.Proto.Departments.DepartmentToUpdateProtos.*;
import static Diadoc.Api.Proto.GetOrganizationsByInnListProtos.*;
import static Diadoc.Api.Proto.Invoicing.InvoiceInfoProtos.*;

public class DiadocApi {

    private AuthManager authManager;
    private AuthenticateClient authClient;
    private OrganizationClient organizationClient;
    private DepartmentClient departmentClient;
    private EmployeeClient employeeClient;
    private UserClient userClient;
    private CounteragentClient counteragentClient;
    private GenerateClient generateClient;
    private ShelfClient shelfClient;
    private MessageClient messageClient;
    private TemplateClient templateClient;
    private DocumentClient documentClient;
    private EventsClient eventsClient;
    private ParseClient parseClient;
    private PrintFormClient printFormClient;
    private SignClient signClient;
    private DocumentTypeClient documentTypeClient;
    private DocflowClient docflowClient;
    private DocflowHttpApiV3 docflow;

    @Deprecated
    public boolean IsAuthenticated() {
        return authManager.isAuthenticated();
    }

    @Deprecated
    public DocflowHttpApiV3 GetDocflow() {
        return this.docflow;
    }

    public DiadocApi(String apiClientId, String url, @Nullable HttpHost proxyHost) {
        if (url == null) {
            throw new IllegalArgumentException("url");
        }
        authManager = new AuthManager(apiClientId);
        DiadocHttpClient diadocHttpClient = new DiadocHttpClient(authManager.getCredentialsProvider(), url, proxyHost);
        authClient = new AuthenticateClient(authManager, diadocHttpClient);
        organizationClient = new OrganizationClient(diadocHttpClient);
        departmentClient = new DepartmentClient(diadocHttpClient);
        employeeClient = new EmployeeClient(diadocHttpClient);
        userClient = new UserClient(diadocHttpClient);
        counteragentClient = new CounteragentClient(diadocHttpClient);
        generateClient = new GenerateClient(diadocHttpClient);
        shelfClient = new ShelfClient(diadocHttpClient);
        messageClient = new MessageClient(diadocHttpClient);
        templateClient = new TemplateClient(diadocHttpClient);
        documentClient = new DocumentClient(diadocHttpClient);
        eventsClient = new EventsClient(diadocHttpClient);
        parseClient = new ParseClient(diadocHttpClient);
        printFormClient = new PrintFormClient(diadocHttpClient);
        signClient = new SignClient(diadocHttpClient);
        documentTypeClient = new DocumentTypeClient(diadocHttpClient);
        docflowClient = new DocflowClient(diadocHttpClient);
        authManager.setCredentials(null);
        this.docflow = new DocflowHttpApiV3();
    }

    public DiadocApi(String apiClientId, String url) {
        this(apiClientId, url, null);
    }

    public AuthenticateClient getAuthClient() {
        return authClient;
    }

    public DepartmentClient getDepartmentClient() {
        return departmentClient;
    }

    public OrganizationClient getOrganizationClient() {
        return organizationClient;
    }

    public EmployeeClient getEmployeeClient() {
        return employeeClient;
    }

    public UserClient getUserClient() {
        return userClient;
    }

    public CounteragentClient getCounteragentClient() {
        return counteragentClient;
    }

    public GenerateClient getGenerateClient() {
        return generateClient;
    }

    public ShelfClient getShelfClient() {
        return shelfClient;
    }

    public MessageClient getMessageClient() {
        return messageClient;
    }

    public TemplateClient templateClient() {
        return templateClient;
    }

    public DocumentClient getDocumentClient() {
        return documentClient;
    }

    public EventsClient getEventsClient() {
        return eventsClient;
    }

    public ParseClient getParseClient() {
        return parseClient;
    }
    public PrintFormClient getPrintFormClient() {
        return printFormClient;
    }

    public SignClient getSignClient() {
        return signClient;
    }

    public DocumentTypeClient getDocumentTypeClient() {
        return documentTypeClient;
    }

    public DocflowClient getDocflowClient() {
        return docflowClient;
    }

    public AuthManager getAuthManager() { return  authManager; }

    /**
     * Use AuthClient instead
     */

    @Deprecated
    public void ConfirmAuthenticationByCertificate(X509Certificate currentCert, String token) throws Exception {
        authClient.confirmAuthenticationByCertificate(currentCert, token);
    }

    /**
     * Use AuthClient instead
     */
    @Deprecated
    public ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo GetExternalServiceAuthInfo(String key) throws IOException {
        try {
            return authClient.getExternalServiceAuthInfo(key);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use AuthClient instead
     */

    @Deprecated
    public void Authenticate(String sid) throws Exception {
        authClient.authenticate(sid);
    }

    /**
     * Use AuthClient instead
     */

    @Deprecated
    public void Authenticate(String login, String password) throws IOException {
        try {
            authClient.authenticate(login, password);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use AuthClient instead
     */

    @Deprecated
    public void Authenticate(X509Certificate currentCert, boolean autoConfirm) throws Exception {
        authClient.authenticate(currentCert, autoConfirm);
    }

    /**
     * Use AuthClient instead
     */

    @Deprecated
    public void Authenticate(X509Certificate currentCert) throws Exception {
        authClient.authenticate(currentCert);
    }

    /**
     * Use ShelfClient instead
     */
    @Deprecated
    public byte[] ShelfDownload(String nameOnShelf) throws IOException {
        try {
            return shelfClient.shelfDownload(nameOnShelf);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Message PostMessage(DiadocMessage_PostApiProtos.MessageToPost msg) throws IOException {
        return PostMessage(msg, null);
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Message PostMessage(DiadocMessage_PostApiProtos.MessageToPost msg, @Nullable String operationId) throws IOException {
        try {
            return messageClient.postMessage(msg, operationId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.MessagePatch PostMessagePatch(DiadocMessage_PostApiProtos.MessagePatchToPost patch) throws IOException {
        return PostMessagePatch(patch, null);
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.MessagePatch PostMessagePatch(DiadocMessage_PostApiProtos.MessagePatchToPost patch, @Nullable String operationId) throws IOException {
        try {
            return messageClient.postMessagePatch(patch, operationId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * Use MessageClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Message GetMessage(String currentBoxId, String messageId, boolean withOriginalSignature) throws IOException {
        try {
            return messageClient.getMessage(currentBoxId, messageId, withOriginalSignature);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Message GetMessage(String currentBoxId, String messageId, boolean withOriginalSignature, boolean injectEntityContent) throws IOException {
        try {
            return messageClient.getMessage(currentBoxId, messageId, withOriginalSignature, injectEntityContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Message GetMessage(String currentBoxId, String messageId) throws IOException {
        try {
            return messageClient.getMessage(currentBoxId, messageId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Message GetMessage(String currentBoxId, String messageId, String entityId) throws IOException {
        try {
            return messageClient.getMessage(currentBoxId, messageId, entityId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Message GetMessage(String currentBoxId, String messageId, String entityId, boolean withOriginalSignature) throws IOException {
        try {
            return messageClient.getMessage(currentBoxId, messageId, entityId, withOriginalSignature);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Message GetMessage(String currentBoxId, String messageId, String entityId, boolean withOriginalSignature, boolean injectEntityContent) throws IOException {
        try {
            return messageClient.getMessage(currentBoxId, messageId, entityId, withOriginalSignature, injectEntityContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public void RecycleDraft(String boxId, String draftId) throws IOException {
        try {
            messageClient.recycleDraft(boxId, draftId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use TemplateClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Template PostTemplate(DiadocMessage_PostApiProtos.TemplateToPost templateToPost) throws IOException {
        try {
            return templateClient.postTemplate(templateToPost);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use TemplateClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Message TransformTemplateToMessage(DiadocMessage_PostApiProtos.TemplateTransformationToPost templateTransformationToPost) throws IOException {
        try {
            return templateClient.transformTemplateToMessage(templateTransformationToPost);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GetMessage from message client instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Template GetTemplate(String currentBoxId, String templateId) throws IOException {
        try {
            return templateClient.getTemplate(currentBoxId, templateId, null);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    /**
     * Use GetMessage from message client instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.Template GetTemplate(String currentBoxId, String templateId, String entityId) throws IOException {
        try {
            return templateClient.getTemplate(currentBoxId, templateId, entityId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    /**
     * Use MessageClient instead
     */
    @Deprecated
    public void Delete(String boxId, String messageId, String documentId) throws Exception {
        messageClient.delete(boxId, messageId, documentId);
    }

    /**
     * Use EventsClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.BoxEventList GetNewEvents(String currentBoxId, String eventIdCurrent) throws IOException {
        try {
            return eventsClient.getNewEvents(currentBoxId, eventIdCurrent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EventsClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.BoxEvent getLastEvent(String boxId) throws IOException {
        try {
            return eventsClient.getLastEvent(boxId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EventsClient instead
     */
    @Deprecated
    public DiadocMessage_GetApiProtos.BoxEvent GetEvent(String boxId, String eventId) throws IOException {
        try {
            return eventsClient.getEvent(boxId, eventId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public OrganizationUserPermissionsProtos.OrganizationUserPermissions GetMyPermissions(String orgId) throws IOException {
        try {
            return organizationClient.getMyPermissions(orgId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public OrganizationProtos.OrganizationList GetMyOrganizations(boolean autoRegister) throws IOException {
        try {
            return organizationClient.getMyOrganizations(autoRegister);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public OrganizationUserProtos.OrganizationUsersList GetOrganizationUsers(String orgId) throws IOException {
        try {
            return organizationClient.getOrganizationUsers(orgId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public OrganizationProtos.OrganizationList GetMyOrganizations() throws IOException {
        try {
            return organizationClient.getMyOrganizations(true);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public OrganizationProtos.OrganizationList GetOrganizationsByInnKpp(String inn, @Nullable String kpp) throws IOException {
        try {
            return organizationClient.getOrganizationsByInnKpp(inn, kpp, false);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public OrganizationProtos.OrganizationList GetOrganizationsByInnKpp(String inn, @Nullable String kpp, boolean includeRelations) throws IOException {
        try {
            return organizationClient.getOrganizationsByInnKpp(inn, kpp, includeRelations);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public List<OrganizationProtos.Organization> GetOrganizationsByInnList(
            GetOrganizationsByInnListRequest request) throws IOException {
        try {
            return Arrays.asList(organizationClient.getOrganizationsByInnList(request));
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public List<OrganizationProtos.Organization> GetOrganizationsByInnList(Iterable<String> innList) throws IOException {
        try {
            return Arrays.asList(organizationClient.getOrganizationsByInnList(innList));
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public List<OrganizationWithCounteragentStatus> GetOrganizationsByInnList(String myOrgId,
                                                                              GetOrganizationsByInnListRequest request) throws IOException {
        try {
            return Arrays.asList(organizationClient.getOrganizationsByInnList(myOrgId, request));
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public List<OrganizationWithCounteragentStatus> GetOrganizationsByInnList(String myOrgId, Iterable<String> innList) throws IOException {
        try {
            return Arrays.asList(organizationClient.getOrganizationsByInnList(myOrgId, innList));
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public OrganizationProtos.Organization GetOrganizationById(String orgId) throws IOException {
        try {
            return organizationClient.getOrganizationById(orgId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public OrganizationProtos.Organization GetOrganizationByInn(String inn) throws IOException {
        try {
            return organizationClient.getOrganizationByInn(inn);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganiztionClient instead
     */
    @Deprecated
    public OrganizationProtos.Organization GetOrganizationByFnsParticipantId(String fnsParticipantId) throws IOException {
        try {
            return organizationClient.getOrganizationByFnsParticipantId(fnsParticipantId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganiztionClient instead
     */
    @Deprecated
    public OrganizationProtos.Box GetBox(String boxId) throws IOException {
        try {
            return organizationClient.getBox(boxId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateReceiptXml(String boxId, String messageId, String attachmentId, SignerProtos.Signer signer)
            throws IllegalStateException, IOException, ParseException {
        try {
            return generateClient.generateReceiptXml(boxId, messageId, attachmentId, signer);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public GeneratedFile GenerateInvoiceDocumentReceiptXml(String boxId, String messageId, String attachmentId, SignerProtos.Signer signer)
            throws IllegalStateException, IOException, ParseException {
        try {
            return generateClient.generateInvoiceDocumentReceiptXml(boxId, messageId, attachmentId, signer);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public GeneratedFile GenerateDocumentReceiptXml(String boxId, String messageId, String attachmentId, SignerProtos.Signer signer)
            throws IllegalStateException, IOException, ParseException {
        try {
            return generateClient.generateDocumentReceiptXml(boxId, messageId, attachmentId, signer);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateInvoiceCorrectionRequestXml(String boxId, String messageId, String attachmentId,
                                                             InvoiceCorrectionRequestInfoProtos.InvoiceCorrectionRequestInfo invoiceCorrectionInfo) throws IllegalStateException, IOException, ParseException {
        try {
            return generateClient.generateInvoiceCorrectionRequestXml(boxId, messageId, attachmentId, invoiceCorrectionInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateRevocationRequestXml(String boxId, String messageId, String attachmentId,
                                                      RevocationRequestInfoProtos.RevocationRequestInfo revocationRequestInfo) throws IllegalStateException, IOException, ParseException {
        try {
            return generateClient.generateRevocationRequestXml(boxId, messageId, attachmentId, revocationRequestInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateSignatureRejectionXml(String boxId, String messageId, String attachmentId,
                                                       SignatureRejectionInfoProtos.SignatureRejectionInfo signatureRejectionInfo) throws IllegalStateException, IOException, ParseException {
        try {
            return generateClient.generateSignatureRejectionXml(boxId, messageId, attachmentId, signatureRejectionInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateInvoiceXml(InvoiceInfo invoiceInfo) throws IOException, ParseException {
        try {
            return generateClient.generateInvoiceXml(invoiceInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateInvoiceXml(InvoiceInfo invoiceInfo, boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateInvoiceXml(invoiceInfo, disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateInvoiceRevisionXml(InvoiceInfo invoiceRevisionInfo) throws IOException, ParseException {
        try {
            return generateClient.generateInvoiceRevisionXml(invoiceRevisionInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateInvoiceRevisionXml(InvoiceInfo invoiceRevisionInfo, boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateInvoiceRevisionXml(invoiceRevisionInfo, disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateInvoiceCorrectionXml(InvoiceCorrectionInfo invoiceCorrectionInfo) throws IOException, ParseException {
        try {
            return generateClient.generateInvoiceCorrectionXml(invoiceCorrectionInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateInvoiceCorrectionXml(InvoiceCorrectionInfo invoiceCorrectionInfo, boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateInvoiceCorrectionXml(invoiceCorrectionInfo, disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateInvoiceCorrectionRevisionXml(InvoiceCorrectionInfo invoiceCorrectionRevisionInfo) throws IOException, ParseException {
        try {
            return generateClient.generateInvoiceCorrectionRevisionXml(invoiceCorrectionRevisionInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateInvoiceCorrectionRevisionXml(InvoiceCorrectionInfo invoiceCorrectionRevisionInfo, boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateInvoiceCorrectionRevisionXml(invoiceCorrectionRevisionInfo, disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateTorg12XmlForSeller(Torg12InfoProtos.Torg12SellerTitleInfo sellerTitleInfo) throws IOException, ParseException {
        try {
            return generateClient.generateTorg12XmlForSeller(sellerTitleInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateTorg12XmlForSeller(Torg12InfoProtos.Torg12SellerTitleInfo sellerTitleInfo, boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateTorg12XmlForSeller(sellerTitleInfo, disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateTorg12XmlForBuyer(Torg12InfoProtos.Torg12BuyerTitleInfo buyerTitleInfo, String boxId, String sellerTitleMessageId, String sellerTitleAttachmentId) throws IOException, ParseException {
        try {
            return generateClient.generateTorg12XmlForBuyer(buyerTitleInfo, boxId, sellerTitleMessageId, sellerTitleAttachmentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateTovTorg551XmlForSeller(TovTorgInfoProtos.TovTorgSellerTitleInfo sellerTitleInfo) throws IOException, ParseException {
        try {
            return generateClient.generateTovTorg551XmlForSeller(sellerTitleInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateTovTorg551XmlForSeller(TovTorgInfoProtos.TovTorgSellerTitleInfo sellerTitleInfo, boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateTovTorg551XmlForSeller(sellerTitleInfo, disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateTovTorg551XmlForBuyer(
            TovTorgInfoProtos.TovTorgBuyerTitleInfo buyerTitleInfo,
            String boxId,
            String sellerTitleMessageId,
            String sellerTitleAttachmentId) throws IOException, ParseException {
        try {
            return generateClient.generateTovTorg551XmlForBuyer(buyerTitleInfo, boxId, sellerTitleMessageId, sellerTitleAttachmentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateTovTorg551XmlForBuyer(
            TovTorgInfoProtos.TovTorgBuyerTitleInfo buyerTitleInfo,
            String boxId,
            String sellerTitleMessageId,
            String sellerTitleAttachmentId,
            String documentVersion) throws IOException, ParseException {
        try {
            return generateClient.generateTovTorg551XmlForBuyer(buyerTitleInfo, boxId, sellerTitleMessageId, sellerTitleAttachmentId, documentVersion);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateAcceptanceCertificateXmlForSeller(AcceptanceCertificateInfoProtos.AcceptanceCertificateSellerTitleInfo sellerTitleInfo) throws IOException, ParseException {
        try {
            return generateClient.generateAcceptanceCertificateXmlForSeller(sellerTitleInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateAcceptanceCertificateXmlForSeller(AcceptanceCertificateInfoProtos.AcceptanceCertificateSellerTitleInfo sellerTitleInfo, boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateAcceptanceCertificateXmlForSeller(sellerTitleInfo, disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateAcceptanceCertificateXmlForBuyer(AcceptanceCertificateInfoProtos.AcceptanceCertificateBuyerTitleInfo buyerTitleInfo, String boxId, String sellerTitleMessageId,
                                                                  String sellerTitleAttachmentId) throws IOException, ParseException {
        try {
            return generateClient.generateAcceptanceCertificateXmlForBuyer(buyerTitleInfo, boxId, sellerTitleMessageId, sellerTitleAttachmentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateAcceptanceCertificate552XmlForSeller(AcceptanceCertificate552InfoProtos.AcceptanceCertificate552SellerTitleInfo sellerTitleInfo) throws IOException, ParseException {
        try {
            return generateClient.generateAcceptanceCertificate552XmlForSeller(sellerTitleInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateAcceptanceCertificate552XmlForSeller(AcceptanceCertificate552InfoProtos.AcceptanceCertificate552SellerTitleInfo sellerTitleInfo, boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateAcceptanceCertificate552XmlForSeller(sellerTitleInfo, disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateAcceptanceCertificate552XmlForBuyer(AcceptanceCertificate552InfoProtos.AcceptanceCertificate552BuyerTitleInfo buyerTitleInfo, String boxId, String sellerTitleMessageId,
                                                                     String sellerTitleAttachmentId) throws IOException, ParseException {
        try {
            return generateClient.generateAcceptanceCertificate552XmlForBuyer(buyerTitleInfo, boxId, sellerTitleMessageId, sellerTitleAttachmentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateUniversalTransferDocumentXmlForSeller(UniversalTransferDocumentInfoProtos.UniversalTransferDocumentSellerTitleInfo utdInfo) throws IOException, ParseException {
        try {
            return generateClient.generateUniversalTransferDocumentXmlForSeller(utdInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateUniversalTransferDocumentXmlForSeller(UniversalTransferDocumentInfoProtos.UniversalTransferDocumentSellerTitleInfo utdInfo, boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateUniversalTransferDocumentXmlForSeller(utdInfo, disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateUniversalTransferDocumentXmlForSeller(UniversalTransferDocumentInfoProtos.UniversalTransferDocumentSellerTitleInfo utdInfo, boolean disableValidation, String documentVersion) throws IOException, ParseException {
        try {
            return generateClient.generateUniversalTransferDocumentXmlForSeller(utdInfo, disableValidation, documentVersion);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateUniversalCorrectionTransferDocumentXmlForSeller(UniversalTransferDocumentInfoProtos.UniversalCorrectionDocumentSellerTitleInfo ucdInfo) throws IOException, ParseException {
        try {
            return generateClient.generateUniversalCorrectionTransferDocumentXmlForSeller(ucdInfo);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateUniversalCorrectionTransferDocumentXmlForSeller(UniversalTransferDocumentInfoProtos.UniversalCorrectionDocumentSellerTitleInfo ucdInfo, boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateUniversalCorrectionTransferDocumentXmlForSeller(ucdInfo, disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateUniversalCorrectionTransferDocumentXmlForSeller(UniversalTransferDocumentInfoProtos.UniversalCorrectionDocumentSellerTitleInfo ucdInfo, boolean disableValidation, String documentVersion) throws IOException, ParseException {
        try {
            return generateClient.generateUniversalCorrectionTransferDocumentXmlForSeller(ucdInfo, disableValidation, documentVersion);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateUniversalTransferDocumentXmlForBuyer(
            UniversalTransferDocumentInfoProtos.UniversalTransferDocumentBuyerTitleInfo buyerTitleInfo,
            String boxId,
            String sellerTitleMessageId,
            String sellerTitleAttachmentId
    ) throws IOException, ParseException {
        try {
            return generateClient.generateUniversalTransferDocumentXmlForBuyer(buyerTitleInfo, boxId, sellerTitleMessageId, sellerTitleAttachmentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateTitleXml(
            String boxId,
            String documentTypeNamedId,
            String documentFunction,
            String documentVersion,
            Integer titleIndex,
            byte[] userContractData,
            String letterId,
            String documentId) throws IOException, ParseException {
        try {
            return generateClient.generateTitleXml(
                    boxId,
                    documentTypeNamedId,
                    documentFunction,
                    documentVersion,
                    titleIndex,
                    userContractData,
                    letterId,
                    documentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateTitleXml(
            String boxId,
            String documentTypeNamedId,
            String documentFunction,
            String documentVersion,
            Integer titleIndex,
            byte[] userContractData,
            String editingSettingId,
            boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateTitleXml(
                    boxId,
                    documentTypeNamedId,
                    documentFunction,
                    documentVersion,
                    titleIndex,
                    userContractData,
                    editingSettingId,
                    disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateTitleXml(
            String boxId,
            String documentTypeNamedId,
            String documentFunction,
            String documentVersion,
            Integer titleIndex,
            byte[] userContractData,
            String editingSettingId,
            boolean disableValidation,
            String letterId,
            String documentId) throws IOException, ParseException {
        try {
            return generateClient.generateTitleXml(
                    boxId,
                    documentTypeNamedId,
                    documentFunction,
                    documentVersion,
                    titleIndex,
                    userContractData,
                    editingSettingId,
                    disableValidation,
                    letterId,
                    documentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateSenderTitleXml(
            String boxId,
            String documentTypeNamedId,
            String documentFunction,
            String documentVersion,
            byte[] userContractData) throws IOException, ParseException {
        try {
            return generateClient.generateSenderTitleXml(
                    boxId,
                    documentTypeNamedId,
                    documentFunction,
                    documentVersion,
                    userContractData);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateSenderTitleXml(
            String boxId,
            String documentTypeNamedId,
            String documentFunction,
            String documentVersion,
            byte[] userContractData,
            String editingSettingId,
            boolean disableValidation) throws IOException, ParseException {
        try {
            return generateClient.generateSenderTitleXml(
                    boxId,
                    documentTypeNamedId,
                    documentFunction,
                    documentVersion,
                    userContractData,
                    editingSettingId,
                    disableValidation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateRecipientTitleXml(
            String boxId,
            String senderTitleMessageId,
            String senderTitleAttachmentId,
            byte[] userContractData
    ) throws IOException, ParseException {
        try {
            return generateClient.generateRecipientTitleXml(
                    boxId,
                    senderTitleMessageId,
                    senderTitleAttachmentId,
                    userContractData);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use GenerateTitleClient instead
     */
    @Deprecated
    public GeneratedFile GenerateRecipientTitleXml(
            String boxId,
            String senderTitleMessageId,
            String senderTitleAttachmentId,
            byte[] userContractData,
            String documentVersion
    ) throws IOException, ParseException {
        try {
            return generateClient.generateRecipientTitleXml(
                    boxId,
                    senderTitleMessageId,
                    senderTitleAttachmentId,
                    userContractData,
                    documentVersion);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public ExtendedSignerProtos.ExtendedSignerDetails GetExtendedSignerDetails(String boxId, String thumbprint, boolean forBuyer, boolean forCorrection) throws IOException {
        ExtendedSignerProtos.DocumentTitleType documentTitleType = CreateUtdDocumentTitleType(forBuyer, forCorrection);
        return GetExtendedSignerDetails(boxId, thumbprint, documentTitleType);
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public ExtendedSignerProtos.ExtendedSignerDetails GetExtendedSignerDetails(String boxId, String thumbprint, ExtendedSignerProtos.DocumentTitleType documentTitleType) throws IOException {
        try {
            return signClient.getExtendedSignerDetails(boxId, thumbprint, documentTitleType);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public ExtendedSignerProtos.ExtendedSignerDetails PostExtendedSignerDetails(String boxId, String thumbprint, boolean forBuyer, boolean forCorrection, ExtendedSignerProtos.ExtendedSignerDetailsToPost signerDetails) throws IOException {
        ExtendedSignerProtos.DocumentTitleType documentTitleType = CreateUtdDocumentTitleType(forBuyer, forCorrection);
        return PostExtendedSignerDetails(boxId, thumbprint, documentTitleType, signerDetails);
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public ExtendedSignerProtos.ExtendedSignerDetails PostExtendedSignerDetails(String boxId, String thumbprint, ExtendedSignerProtos.DocumentTitleType documentTitleType, ExtendedSignerProtos.ExtendedSignerDetailsToPost signerDetails) throws IOException {
        try {
            return signClient.postExtendedSignerDetails(boxId, thumbprint, documentTitleType, signerDetails);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static ExtendedSignerProtos.DocumentTitleType CreateUtdDocumentTitleType(boolean forBuyer, boolean forCorrection) {
        return forBuyer
                ? (forCorrection ? ExtendedSignerProtos.DocumentTitleType.UcdBuyer : ExtendedSignerProtos.DocumentTitleType.UtdBuyer)
                : (forCorrection ? ExtendedSignerProtos.DocumentTitleType.UcdSeller : ExtendedSignerProtos.DocumentTitleType.UtdSeller);
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public InvoiceInfo ParseInvoiceXml(byte[] invoiceXmlContent) throws IOException {
        try {
            return parseClient.parseInvoiceXml(invoiceXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public Torg12InfoProtos.Torg12SellerTitleInfo ParseTorg12SellerTitleXml(byte[] sellerTitleXmlContent) throws IOException {
        try {
            return parseClient.parseTorg12SellerTitleXml(sellerTitleXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public Torg12InfoProtos.Torg12BuyerTitleInfo ParseTorg12BuyerTitleXml(byte[] buyerTitleXmlContent) throws IOException {
        try {
            return parseClient.parseTorg12BuyerTitleXml(buyerTitleXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public TovTorgInfoProtos.TovTorgSellerTitleInfo ParseTovTorg551SellerTitleXml(byte[] sellerTitleXmlContent) throws IOException {
        try {
            return parseClient.parseTovTorg551SellerTitleXml(sellerTitleXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public TovTorgInfoProtos.TovTorgBuyerTitleInfo ParseTovTorg551BuyerTitleXml(byte[] buyerTitleXmlContent) throws IOException {
        try {
            return parseClient.parseTovTorg551BuyerTitleXml(buyerTitleXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public AcceptanceCertificateInfoProtos.AcceptanceCertificateSellerTitleInfo ParseAcceptanceCertificateSellerTitleXml(byte[] sellerTitleXmlContent) throws IOException {
        try {
            return parseClient.parseAcceptanceCertificateSellerTitleXml(sellerTitleXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public AcceptanceCertificateInfoProtos.AcceptanceCertificateBuyerTitleInfo ParseAcceptanceCertificateBuyerTitleXml(byte[] buyerTitleXmlContent) throws IOException {
        try {
            return parseClient.parseAcceptanceCertificateBuyerTitleXml(buyerTitleXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public AcceptanceCertificate552InfoProtos.AcceptanceCertificate552SellerTitleInfo ParseAcceptanceCertificate552SellerTitleXml(byte[] sellerTitleXmlContent) throws IOException {
        try {
            return parseClient.parseAcceptanceCertificate552SellerTitleXml(sellerTitleXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public AcceptanceCertificate552InfoProtos.AcceptanceCertificate552BuyerTitleInfo ParseAcceptanceCertificate552BuyerTitleXml(byte[] buyerTitleXmlContent) throws IOException {
        try {
            return parseClient.parseAcceptanceCertificate552BuyerTitleXml(buyerTitleXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public UniversalTransferDocumentInfoProtos.UniversalTransferDocumentSellerTitleInfo ParseUniversalTransferDocumentSellerTitleXml(byte[] utdXmlContent) throws IOException {
        try {
            return parseClient.parseUniversalTransferDocumentSellerTitleXml(utdXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public UniversalTransferDocumentInfoProtos.UniversalTransferDocumentSellerTitleInfo ParseUniversalTransferDocumentSellerTitleXml(byte[] utdXmlContent, String documentVersion) throws IOException {
        try {
            return parseClient.parseUniversalTransferDocumentSellerTitleXml(utdXmlContent, documentVersion);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public UniversalTransferDocumentInfoProtos.UniversalTransferDocumentBuyerTitleInfo ParseUniversalTransferDocumentBuyerTitleXml(byte[] utdXmlContent) throws IOException {
        try {
            return parseClient.parseUniversalTransferDocumentBuyerTitleXml(utdXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public UniversalTransferDocumentInfoProtos.UniversalCorrectionDocumentSellerTitleInfo ParseUniversalCorrectionDocumentSellerTitleXml(byte[] utdXmlContent) throws IOException {
        try {
            return parseClient.parseUniversalCorrectionDocumentSellerTitleXml(utdXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public UniversalTransferDocumentInfoProtos.UniversalCorrectionDocumentSellerTitleInfo ParseUniversalCorrectionDocumentSellerTitleXml(byte[] utdXmlContent, String documentVersion) throws IOException {
        try {
            return parseClient.parseUniversalCorrectionDocumentSellerTitleXml(utdXmlContent, documentVersion);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public UniversalTransferDocumentInfoProtos.UniversalTransferDocumentBuyerTitleInfo ParseUniversalCorrectionDocumentBuyerTitleXml(byte[] utdXmlContent) throws IOException {
        try {
            return parseClient.parseUniversalCorrectionDocumentBuyerTitleXml(utdXmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public byte[] ParseTitleXml(String boxId, String documentTypeNamedId, String documentFunction, String documentVersion, Integer titleIndex, byte[] content) throws IOException {
        try {
            return parseClient.parseTitleXml(boxId, documentTypeNamedId, documentFunction, documentVersion, titleIndex, content);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public RevocationRequestInfoProtos.RevocationRequestInfo ParseRevocationRequestXml(byte[] xmlContent) throws IOException {
        try {
            return parseClient.parseRevocationRequestXml(xmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ParseClient instead
     */
    @Deprecated
    public SignatureRejectionInfoProtos.SignatureRejectionInfo ParseSignatureRejectionXml(byte[] xmlContent) throws IOException {
        try {
            return parseClient.parseSignatureRejectionXml(xmlContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public InvoiceCorrectionRequestInfoProtos.InvoiceCorrectionRequestInfo GetInvoiceCorrectionRequestInfo(String boxId, String messageId, String entityId) throws IOException {
        try {
            return messageClient.getInvoiceCorrectionRequestInfo(boxId, messageId, entityId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use PrintFormClient instead
     */
    @Deprecated
    public CustomPrintFormDetectionProtos.CustomPrintFormDetectionResult detectCustomPrintForms(String boxId, CustomPrintFormDetectionProtos.CustomPrintFormDetectionRequest detectionRequest) throws IOException {
        try {
            return printFormClient.detectCustomPrintForms(boxId, detectionRequest);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * Use PrintFormClient instead
     */
    @Deprecated
    public PrintFormResult GeneratePrintForm(String boxId, String messageId, String documentId) throws IllegalStateException, IOException, ParseException {
        try {
            return printFormClient.generatePrintForm(boxId, messageId, documentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use PrintFormClient instead
     */
    @Deprecated
    public DocumentProtocolResult GenerateDocumentProtocol(String boxId, String messageId, String documentId) throws IllegalStateException, IOException, ParseException {
        try {
            return printFormClient.generateDocumentProtocol(boxId, messageId, documentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use PrintFormClient instead
     */
    @Deprecated
    public DocumentZipResult GenerateDocumentZip(String boxId, String messageId, String documentId, Boolean fullDocflow) throws IllegalStateException, IOException, ParseException {
        try {
            return printFormClient.generateDocumentZip(boxId, messageId, documentId, fullDocflow);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * Use DocumentClient instead
     */
    @Deprecated
    public DocumentListProtos.DocumentList GetDocuments(DocumentsFilter filter) throws IOException {
        try {
            return documentClient.getDocuments(filter);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentClient instead
     */
    @Deprecated
    public byte[] GetEntityContent(String currentBoxId, String messageId, String entityId) throws IOException {
        try {
            return documentClient.getEntityContent(currentBoxId, messageId, entityId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentClient instead
     */
    @Deprecated
    public DocumentListProtos.DocumentList GetDocuments(String boxId, String filterCategory, String counteragentBoxId, Date timestampFrom, Date timestampTo, String fromDocumentDate, String toDocumentDate, String departmentId, boolean excludeSubdepartments, String afterIndexKey) throws IOException {
        try {
            return documentClient.getDocuments(boxId, filterCategory, counteragentBoxId, timestampFrom, timestampTo, fromDocumentDate, toDocumentDate, departmentId, excludeSubdepartments, afterIndexKey, null);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentClient instead
     */
    @Deprecated
    public DocumentListProtos.DocumentList GetDocuments(String boxId, String filterCategory, String counteragentBoxId, Date timestampFrom, Date timestampTo, String fromDocumentDate, String toDocumentDate, String departmentId, boolean excludeSubdepartments, String afterIndexKey, Integer count) throws IOException {
        try {
            return documentClient.getDocuments(boxId, filterCategory, counteragentBoxId, timestampFrom, timestampTo, fromDocumentDate, toDocumentDate, departmentId, excludeSubdepartments, afterIndexKey, count);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentClient instead
     */
    @Deprecated
    public DocumentListProtos.DocumentList GetDocumentsByMessageId(String boxId, String messageId) throws IOException {
        try {
            return documentClient.getDocumentsByMessageId(boxId, messageId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentClient instead
     */
    @Deprecated
    public DocumentProtos.Document GetDocument(String boxId, String messageId, String entityId) throws IOException {
        try {
            return documentClient.getDocument(boxId, messageId, entityId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentClient instead
     */
    @Deprecated
    public DiadocMessage_PostApiProtos.PrepareDocumentsToSignResponse PrepareDocumentsToSign(DiadocMessage_PostApiProtos.PrepareDocumentsToSignRequest request) throws IOException {
        try {
            return documentClient.prepareDocumentsToSign(request);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentClient instead
     */
    @Deprecated
    public SignatureInfoProtos.SignatureInfo GetSignatureInfo(String boxId, String messageId, String entityId) throws IOException {
        try {
            return documentClient.getSignatureInfo(boxId, messageId, entityId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use CounteragentClient instead
     */
    @Deprecated
    public CounteragentProtos.Counteragent GetCounteragent(String myOrgId, String counteragentOrgId) throws IOException {
        try {
            return counteragentClient.getCounteragent(myOrgId, counteragentOrgId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use CounteragentClient instead
     */
    @Deprecated
    public CounteragentProtos.CounteragentCertificateList GetCounteragentCertificates(String myOrgId, String counteragentOrgId) throws IOException {
        try {
            return counteragentClient.getCounteragentCertificates(myOrgId, counteragentOrgId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use CounteragentClient instead
     */
    @Deprecated
    public CounteragentProtos.CounteragentList GetCounteragents(String myOrgId, String counteragentStatus, String afterIndexKey) throws IOException {
        try {
            return counteragentClient.getCounteragents(myOrgId, counteragentStatus, afterIndexKey);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use CounteragentClient instead
     */
    @Deprecated
    public AsyncMethodResultProtos.AsyncMethodResult AcquireCounteragent(String myOrgId, AcquireCounteragentProtos.AcquireCounteragentRequest request) throws IOException {
        try {
            return counteragentClient.acquireCounteragent(myOrgId, request);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use CounteragentClient instead
     */
    @Deprecated
    public AsyncMethodResultProtos.AsyncMethodResult AcquireCounteragent(String myOrgId, String myDepartmentId, AcquireCounteragentProtos.AcquireCounteragentRequest request) throws IOException {
        try {
            return counteragentClient.acquireCounteragent(myOrgId, myDepartmentId, request);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use CounteragentClient instead
     */
    @Deprecated
    public AcquireCounteragentProtos.AcquireCounteragentResult WaitAcquireCounteragentResult(String taskId, Integer timeoutInMillis) throws Exception {
        return counteragentClient.waitAcquireCounteragentResult(taskId, timeoutInMillis);
    }

    /**
     * Use CounteragentClient instead
     */
    @Deprecated
    public void BreakWithCounteragent(String myOrgId, String counteragentOrgId, String comment) throws IOException {
        try {
            counteragentClient.breakWithCounteragent(myOrgId, counteragentOrgId, comment);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use MessageClient instead
     */
    @Deprecated
    public boolean CanSendInvoice(String boxId, byte[] certBytes) throws IOException {
        try {
            return organizationClient.canSendInvoice(boxId, certBytes);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentClient instead
     */
    @Deprecated
    public void MoveDocuments(DocumentsMoveOperationProtos.DocumentsMoveOperation operation) throws IOException {
        try {
            documentClient.moveDocuments(operation);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use ShelfClient instead
     */
    @Deprecated
    public int GetShelfUploadChunkSize() {
        return shelfClient.getShelfUploadChunkSize();
    }

    /**
     * Use ShelfClient instead
     */
    @Deprecated
    public int GetShelfUploadMaxAttemptsCount() {
        return shelfClient.getShelfUploadMaxAttemptsCount();
    }

    /**
     * Use ShelfClient instead
     */
    @Deprecated
    public String UploadFileToShelf(byte[] data) throws Exception {
        return shelfClient.uploadFileToShelf(data);
    }

    /**
     * Use UserClient instead
     */
    @Deprecated
    public UserProtos.User GetMyUser() throws IOException {
        try {
            return userClient.getMyUser();
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use UserClient instead
     */
    @Deprecated
    public UserProtos.UserV2 GetMyUserV2() throws IOException {
        try {
            return userClient.getMyUserV2();
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use UserClient instead
     */
    @Deprecated
    public UserProtos.UserV2 UpdateMyUser(UserToUpdateProtos.UserToUpdate userToUpdate) throws IOException {
        try {
            return userClient.updateMyUser(userToUpdate);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DepartmentClient instead
     */
    @Deprecated
    public DepartmentProtos.Department GetDepartmentByFullId(String boxId, String departmentId) throws IOException {
        try {
            return departmentClient.getDepartmentByFullId(boxId, departmentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DepartmentClient instead
     */
    @Deprecated
    public OrganizationProtos.Department GetDepartment(String orgId, String departmentId) throws IOException {
        try {
            return departmentClient.getDepartment(orgId, departmentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * Use DepartmentClient instead
     */
    @Deprecated
    public DepartmentList GetDepartments(String boxId) throws IOException {
        try {
            return departmentClient.getDepartments(boxId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DepartmentClient instead
     */
    @Deprecated
    public DepartmentList GetDepartments(String boxId, int page) throws IOException {
        try {
            return departmentClient.getDepartments(boxId, page);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DepartmentClient instead
     */
    @Deprecated
    public DepartmentList GetDepartments(String boxId, int page, int count) throws IOException {
        try {
            return departmentClient.getDepartments(boxId, page, count);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DepartmentClient instead
     */
    @Deprecated
    public DepartmentProtos.Department CreateDepartment(String boxId, DepartmentToCreate departmentToCreate) throws IOException {
        try {
            return departmentClient.createDepartment(boxId, departmentToCreate);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DepartmentClient instead
     */
    @Deprecated
    public DepartmentProtos.Department UpdateDepartment(String boxId, String departmentId, DepartmentToUpdate departmentToUpdate) throws IOException {
        try {
            return departmentClient.updateDepartment(boxId, departmentId, departmentToUpdate);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DepartmentClient instead
     */
    @Deprecated
    public void DeleteDepartment(String boxId, String departmentId) throws IOException {
        try {
            departmentClient.deleteDepartment(boxId, departmentId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EmployeeClient instead
     */
    @Deprecated
    public EmployeeProtos.Employee GetEmployee(String boxId, String userId) throws IOException {
        try {
            return employeeClient.getEmployee(boxId, userId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EmployeeClient instead
     */
    @Deprecated
    public EmployeeProtos.EmployeeList GetEmployees(String boxId) throws IOException {
        try {
            return employeeClient.getEmployees(boxId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EmployeeClient instead
     */
    @Deprecated
    public EmployeeProtos.EmployeeList GetEmployees(String boxId, int page) throws IOException {
        try {
            return employeeClient.getEmployees(boxId, page);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EmployeeClient instead
     */
    @Deprecated
    public EmployeeProtos.EmployeeList GetEmployees(String boxId, int page, int count) throws IOException {
        try {
            return employeeClient.getEmployees(boxId, page, count);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EmployeeClient instead
     */
    @Deprecated
    public EmployeeProtos.Employee CreateEmployee(String boxId, EmployeeToCreateProtos.EmployeeToCreate employeeToCreate) throws IOException {
        try {
            return employeeClient.createEmployee(boxId, employeeToCreate);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EmployeeClient instead
     */
    @Deprecated
    public EmployeeProtos.Employee UpdateEmployee(String boxId, String userId, EmployeeToUpdateProtos.EmployeeToUpdate employeeToUpdate) throws IOException {
        try {
            return employeeClient.updateEmployee(boxId, userId, employeeToUpdate);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EmployeeClient instead
     */
    @Deprecated
    public void DeleteEmployee(String boxId, String userId) throws IOException {
        try {
            employeeClient.deleteEmployee(boxId, userId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EmployeeClient instead
     */
    @Deprecated
    public EmployeeProtos.Employee GetMyEmployee(String boxId) throws IOException {
        try {
            return employeeClient.getMyEmployee(boxId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EmployeeClient instead
     */
    @Deprecated
    public SubscriptionProtos.EmployeeSubscriptions GetSubscriptions(String boxId, String userId) throws IOException {
        try {
            return employeeClient.getSubscriptions(boxId, userId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use EmployeeClient instead
     */
    @Deprecated
    public SubscriptionProtos.EmployeeSubscriptions UpdateSubscriptions(String boxId, String userId, SubscriptionProtos.SubscriptionsToUpdate subscriptionsToUpdate) throws IOException {
        try {
            return employeeClient.updateSubscriptions(boxId, userId, subscriptionsToUpdate);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public AsyncMethodResultProtos.AsyncMethodResult CloudSign(CloudSignProtos.CloudSignRequest request) throws Exception {
        return signClient.cloudSign(request);
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public AsyncMethodResultProtos.AsyncMethodResult CloudSign(CloudSignProtos.CloudSignRequest request, String certificateThumbprint) throws Exception {
        return signClient.cloudSign(request, certificateThumbprint);
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public CloudSignProtos.CloudSignResult WaitCloudSignResult(String taskId, Integer timeoutInMillis) throws Exception {
        return signClient.waitCloudSignResult(taskId, timeoutInMillis);
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public AsyncMethodResultProtos.AsyncMethodResult CloudSignConfirm(String token, String confirmationCode, Boolean returnContent) throws IOException {
        try {
            return signClient.cloudSignConfirm(token, confirmationCode, returnContent);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public CloudSignProtos.CloudSignConfirmResult WaitCloudSignConfirmResult(String taskId, Integer timeoutInMillis) throws Exception {
        return signClient.waitCloudSignConfirmResult(taskId, timeoutInMillis);
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public AsyncMethodResultProtos.AsyncMethodResult AutoSignReceipts(String boxId, String certificateThumbprint, String batchKey) throws Exception {
        return signClient.autoSignReceipts(boxId, certificateThumbprint, batchKey);
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public CloudSignProtos.AutosignReceiptsResult WaitAutosignReceiptsResult(String taskId, Integer timeoutInMillis)
            throws Exception {
        return signClient.waitAutosignReceiptsResult(taskId, timeoutInMillis);
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public AsyncMethodResultProtos.AsyncMethodResult DssSign(String boxId, DssSignProtos.DssSignRequest request) throws Exception {
        return signClient.dssSign(boxId, request);
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public AsyncMethodResultProtos.AsyncMethodResult DssSign(String boxId, DssSignProtos.DssSignRequest request, String certificateThumbprint) throws Exception {
        return signClient.dssSign(boxId, request, certificateThumbprint);
    }

    /**
     * Use SignClient instead
     */
    @Deprecated
    public DssSignProtos.DssSignResult DssSignResult(String boxId, String taskId) throws Exception {
        return signClient.dssSignResult(boxId, taskId);
    }

    /**
     * Use DocflowClient instead
     */
    @Deprecated
    public DocflowApiProtos.SearchDocflowsResponse SearchDocflows(String boxId, DocflowApiProtos.SearchDocflowsRequest request) throws IOException {
        try {
            return docflowClient.searchDocflows(boxId, request);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocflowClient instead
     */
    @Deprecated
    public DocflowApiProtos.GetDocflowsByPacketIdResponse GetDocflowsByPacketId(String boxId, DocflowApiProtos.GetDocflowsByPacketIdRequest request) throws IOException {
        try {
            return docflowClient.getDocflowsByPacketId(boxId, request);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentTypeClient instead
     */
    @Deprecated
    public DocumentTypeDescriptionProtos.GetDocumentTypesResponse GetDocumentTypes(String boxId) throws IOException {
        try {
            return documentTypeClient.getDocumentTypes(boxId);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentTypeClient instead
     */
    @Deprecated
    public DocumentTypeDescriptionProtos.DetectDocumentTypesResponse DetectDocumentTypes(String boxId, String nameOnShelf) throws IOException {
        try {
            return documentTypeClient.detectDocumentTypes(boxId, nameOnShelf);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentTypeClient instead
     */
    @Deprecated
    public DetectTitleResponseProtos.DetectTitleResponse DetectDocumentTitles(String boxId, String nameOnShelf) throws IOException {
        try {
            return documentTypeClient.detectDocumentTitles(boxId, nameOnShelf);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentTypeClient instead
     */
    @Deprecated
    public DetectTitleResponseProtos.DetectTitleResponse DetectDocumentTitles(String boxId, byte[] content) throws IOException {
        try {
            return documentTypeClient.detectDocumentTitles(boxId, content);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * Use DocumentTypeClient instead
     */
    @Deprecated
    public DocumentTypeDescriptionProtos.DetectDocumentTypesResponse DetectDocumentTypes(String boxId, byte[] content) throws IOException {
        try {
            return documentTypeClient.detectDocumentTypes(boxId, content);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentTypeClient instead
     */
    @Deprecated
    public FileContent GetContent(String typeNamedId, String function, String version, int titleIndex) throws IOException {
        try {
            return documentTypeClient.getContent(typeNamedId, function, version, titleIndex, XsdContentType.TitleXsd);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use DocumentTypeClient instead
     */
    @Deprecated
    public FileContent GetContent(String typeNamedId, String function, String version, int titleIndex, XsdContentType contentType) throws IOException {
        try {
            return documentTypeClient.getContent(typeNamedId, function, version, titleIndex, contentType);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public RegistrationRequestProtos.RegistrationResponse Register(RegistrationRequestProtos.RegistrationRequest request) throws IOException {
        try {
            return organizationClient.register(request);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Use OrganizationClient instead
     */
    @Deprecated
    public void RegisterConfirm(RegistrationRequestProtos.RegistrationConfirmRequest request) throws IOException {
        try {
            organizationClient.registerConfirm(request);
        } catch (DiadocSdkException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public class DocflowHttpApiV3 {
        /**
         * Use DocflowClient instead
         */
        @Deprecated
        public DocflowApiV3Protos.GetDocflowBatchResponseV3 GetDocflows(String boxId, DocflowApiProtos.GetDocflowBatchRequest request) throws IOException {
            try {
                return docflowClient.getDocflows(boxId, request);
            } catch (DiadocSdkException e) {
                if (e.getCause() instanceof IOException) {
                    throw (IOException) e.getCause();
                }
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        /**
         * Use DocflowClient instead
         */
        @Deprecated
        public DocflowApiV3Protos.GetDocflowEventsResponseV3 GetDocflowEvents(String boxId, DocflowApiProtos.GetDocflowEventsRequest request) throws IOException {
            try {
                return docflowClient.getDocflowEvents(boxId, request);
            } catch (DiadocSdkException e) {
                if (e.getCause() instanceof IOException) {
                    throw (IOException) e.getCause();
                }
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        /**
         * Use DocflowClient instead
         */
        @Deprecated
        public DocflowApiV3Protos.SearchDocflowsResponseV3 SearchDocflows(String boxId, DocflowApiProtos.SearchDocflowsRequest request) throws IOException {
            try {
                return docflowClient.searchDocflowsV3(boxId, request);
            } catch (DiadocSdkException e) {
                if (e.getCause() instanceof IOException) {
                    throw (IOException) e.getCause();
                }
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        /**
         * Use DocflowClient instead
         */
        @Deprecated
        public DocflowApiV3Protos.GetDocflowsByPacketIdResponseV3 GetDocflowsByPacketId(String boxId, DocflowApiProtos.GetDocflowsByPacketIdRequest request) throws IOException {
            try {
                return docflowClient.getDocflowsByPacketIdV3(boxId, request);
            } catch (DiadocSdkException e) {
                if (e.getCause() instanceof IOException) {
                    throw (IOException) e.getCause();
                }
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}
