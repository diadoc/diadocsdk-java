package Diadoc.Api;

import Diadoc.Api.auth.*;
import Diadoc.Api.auth.oidc.OidcAuthManager;
import Diadoc.Api.auth.oidc.TokenProvider;
import Diadoc.Api.counteragent.CounteragentClient;
import Diadoc.Api.counteragentGroup.CounteragentGroupClient;
import Diadoc.Api.department.DepartmentClient;
import Diadoc.Api.docflow.DocflowClient;
import Diadoc.Api.document.DocumentClient;
import Diadoc.Api.documentType.DocumentTypeClient;
import Diadoc.Api.documentWorkflow.DocumentWorkflowClient;
import Diadoc.Api.employee.EmployeeClient;
import Diadoc.Api.employeePowersOfAttorney.EmployeePowerOfAttorneyClient;
import Diadoc.Api.events.EventsClient;
import Diadoc.Api.generateTitle.GenerateClient;
import Diadoc.Api.httpClient.DiadocHttpClient;
import Diadoc.Api.message.MessageClient;
import Diadoc.Api.operators.OperatorClient;
import Diadoc.Api.organizations.OrganizationClient;
import Diadoc.Api.parse.ParseClient;
import Diadoc.Api.powersOfAttorney.PowerOfAttorneyClient;
import Diadoc.Api.print.PrintFormClient;
import Diadoc.Api.shelf.ShelfClient;
import Diadoc.Api.sign.SignClient;
import Diadoc.Api.template.TemplateClient;
import Diadoc.Api.user.UserClient;
import org.apache.http.HttpHost;
import org.jetbrains.annotations.Nullable;

public class DiadocApi {

    private final AuthenticationType authenticationType;
    private final AuthManager authManager;
    private final AuthenticateClient authClient;
    private final OrganizationClient organizationClient;
    private final DepartmentClient departmentClient;
    private final EmployeeClient employeeClient;
    private final UserClient userClient;
    private final CounteragentClient counteragentClient;
    private final CounteragentGroupClient counteragentGroupClient;
    private final GenerateClient generateClient;
    private final ShelfClient shelfClient;
    private final MessageClient messageClient;
    private final TemplateClient templateClient;
    private final DocumentClient documentClient;
    private final EventsClient eventsClient;
    private final ParseClient parseClient;
    private final PrintFormClient printFormClient;
    private final SignClient signClient;
    private final DocumentTypeClient documentTypeClient;
    private final DocflowClient docflowClient;
    private final PowerOfAttorneyClient powerOfAttorneyClient;
    private final EmployeePowerOfAttorneyClient employeePowerOfAttorneyClient;
    private final DocumentWorkflowClient documentWorkflowClient;

    private final OperatorClient operatorClient;
    private final DiadocHttpClient diadocHttpClient;

    public DiadocApi(String apiClientId, String url, @Nullable HttpHost proxyHost, @Nullable ConnectionSettings connectionSettings) {
        this(new AuthManager(apiClientId), url, proxyHost, connectionSettings);
    }

    public DiadocApi(TokenProvider tokenProvider,  String url, @Nullable HttpHost proxyHost, @Nullable ConnectionSettings connectionSettings) {
        this(new OidcAuthManager(tokenProvider), url, proxyHost, connectionSettings);
    }

    private DiadocApi(IAuthManager authManager, String url, @Nullable HttpHost proxyHost, @Nullable ConnectionSettings connectionSettings) {
        if (url == null) {
            throw new IllegalArgumentException("url");
        }
        this.authManager = authManager.getAuthenticationType().equals(AuthenticationType.DIADOC) ? (AuthManager) authManager : new FallbackAuthManager();
        diadocHttpClient = new DiadocHttpClient(authManager.getCredentialsProvider(), url, proxyHost, connectionSettings);
        authenticationType = authManager.getAuthenticationType();
        authClient = authManager.createAuthenticateClient(diadocHttpClient);
        organizationClient = new OrganizationClient(diadocHttpClient);
        departmentClient = new DepartmentClient(diadocHttpClient);
        employeeClient = new EmployeeClient(diadocHttpClient);
        userClient = new UserClient(diadocHttpClient);
        counteragentClient = new CounteragentClient(diadocHttpClient);
        counteragentGroupClient = new CounteragentGroupClient(diadocHttpClient);
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
        powerOfAttorneyClient = new PowerOfAttorneyClient(diadocHttpClient);
        employeePowerOfAttorneyClient = new EmployeePowerOfAttorneyClient(diadocHttpClient);
        documentWorkflowClient = new DocumentWorkflowClient(diadocHttpClient);
        operatorClient = new OperatorClient(diadocHttpClient);
    }

    public DiadocApi(String apiClientId, String url) {
        this(apiClientId, url, null, null);
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

    public CounteragentGroupClient getCounteragentGroupClient() {
        return counteragentGroupClient;
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

    public PowerOfAttorneyClient getPowerOfAttorneyClient() {
        return powerOfAttorneyClient;
    }

    public EmployeePowerOfAttorneyClient getEmployeePowerOfAttorneyClient() {
        return employeePowerOfAttorneyClient;
    }

    /**
     * @deprecated
     * Use {@link #getDocumentWorkflowClient()}
     */
    @Deprecated
    public DocumentWorkflowClient gDocumentWorkflowClient() {
        return documentWorkflowClient;
    }

    public DocumentWorkflowClient getDocumentWorkflowClient() {
        return documentWorkflowClient;
    }

    public AuthManager getAuthManager() {
        return authManager;
    }

    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    public TemplateClient getTemplateClient() {
        return templateClient;
    }

    public OperatorClient getOperatorClient() {
        return operatorClient;
    }

    public DiadocHttpClient getDiadocHttpClient() {
        return diadocHttpClient;
    }

    public void setSolutionInfo(String solutionInfo) {
        diadocHttpClient.setSolutionInfo(solutionInfo);
    }
}
