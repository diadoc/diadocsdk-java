package Diadoc.Api;

import Diadoc.Api.auth.AuthManager;
import Diadoc.Api.auth.AuthenticateClient;
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

    private AuthManager authManager;
    private AuthenticateClient authClient;
    private OrganizationClient organizationClient;
    private DepartmentClient departmentClient;
    private EmployeeClient employeeClient;
    private UserClient userClient;
    private CounteragentClient counteragentClient;
    private CounteragentGroupClient counteragentGroupClient;
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
    private PowerOfAttorneyClient powerOfAttorneyClient;
    private EmployeePowerOfAttorneyClient employeePowerOfAttorneyClient;
    private DocumentWorkflowClient documentWorkflowClient;
    private DiadocHttpClient diadocHttpClient;

    public DiadocApi(String apiClientId, String url, @Nullable HttpHost proxyHost, @Nullable ConnectionSettings connectionSettings) {
        if (url == null) {
            throw new IllegalArgumentException("url");
        }
        authManager = new AuthManager(apiClientId);
        diadocHttpClient = new DiadocHttpClient(authManager.getCredentialsProvider(), url, proxyHost, connectionSettings);
        authClient = new AuthenticateClient(authManager, diadocHttpClient);
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
        authManager.setCredentials(null);
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

    public DocumentWorkflowClient gDocumentWorkflowClient() {
        return documentWorkflowClient;
    }

    public AuthManager getAuthManager() {
        return authManager;
    }

    public void setSolutionInfo(String solutionInfo) {
        diadocHttpClient.setSolutionInfo(solutionInfo);
    }
}
