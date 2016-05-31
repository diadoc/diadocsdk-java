package Diadoc.Api;

import java.util.Date;

public class DocumentsFilter {
    public String boxId;
    public String filterCategory;
    public String counteragentBoxId;
    public Date timestampFrom;
    public Date timestampTo;
    public String fromDocumentDate;
    public String toDocumentDate;
    public String departmentId;
    public boolean excludeSubdepartments;
    public String sortDirection;
    public String afterIndexKey;
}
