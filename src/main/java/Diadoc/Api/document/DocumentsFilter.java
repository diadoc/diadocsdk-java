package Diadoc.Api.document;

import javax.swing.text.DocumentFilter;
import java.util.Date;

public class DocumentsFilter {
    private String boxId;
    private String filterCategory;
    private String counteragentBoxId;
    private Date timestampFrom;
    private Date timestampTo;
    private String fromDocumentDate;
    private String toDocumentDate;
    private String departmentId;
    private boolean excludeSubdepartments;
    private String sortDirection;
    private String afterIndexKey;
    private Integer count;

    public DocumentsFilter(){}

    public DocumentsFilter(
            String boxId,
            String filterCategory,
            String counteragentBoxId,
            Date timestampFrom,
            Date timestampTo,
            String fromDocumentDate,
            String toDocumentDate,
            String departmentId,
            boolean excludeSubdepartments,
            String sortDirection,
            String afterIndexKey,
            Integer count) {
        this.boxId = boxId;
        this.filterCategory = filterCategory;
        this.counteragentBoxId = counteragentBoxId;
        this.timestampFrom = timestampFrom;
        this.timestampTo = timestampTo;
        this.fromDocumentDate = fromDocumentDate;
        this.toDocumentDate = toDocumentDate;
        this.departmentId = departmentId;
        this.excludeSubdepartments = excludeSubdepartments;
        this.sortDirection = sortDirection;
        this.afterIndexKey = afterIndexKey;
        this.count = count;
    }

    public String getBoxId() {
        return boxId;
    }

    public DocumentsFilter setBoxId(String boxId) {
        this.boxId = boxId;
        return this;
    }

    public String getFilterCategory() {
        return filterCategory;
    }

    public DocumentsFilter setFilterCategory(String filterCategory) {
        this.filterCategory = filterCategory;
        return this;
    }

    public String getCounteragentBoxId() {
        return counteragentBoxId;
    }

    public DocumentsFilter setCounteragentBoxId(String counteragentBoxId) {
        this.counteragentBoxId = counteragentBoxId;
        return this;
    }

    public Date getTimestampFrom() {
        return timestampFrom;
    }

    public DocumentsFilter setTimestampFrom(Date timestampFrom) {
        this.timestampFrom = timestampFrom;
        return this;
    }

    public Date getTimestampTo() {
        return timestampTo;
    }

    public DocumentsFilter setTimestampTo(Date timestampTo) {
        this.timestampTo = timestampTo;
        return this;
    }

    public String getFromDocumentDate() {
        return fromDocumentDate;
    }

    public DocumentsFilter setFromDocumentDate(String fromDocumentDate) {
        this.fromDocumentDate = fromDocumentDate;
        return this;
    }

    public String getToDocumentDate() {
        return toDocumentDate;
    }

    public DocumentsFilter setToDocumentDate(String toDocumentDate) {
        this.toDocumentDate = toDocumentDate;
        return this;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public DocumentsFilter setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }

    public boolean isExcludeSubdepartments() {
        return excludeSubdepartments;
    }

    public DocumentsFilter setExcludeSubdepartments(boolean excludeSubdepartments) {
        this.excludeSubdepartments = excludeSubdepartments;
        return this;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public DocumentsFilter setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }

    public String getAfterIndexKey() {
        return afterIndexKey;
    }

    public DocumentsFilter setAfterIndexKey(String afterIndexKey) {
        this.afterIndexKey = afterIndexKey;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public DocumentsFilter setCount(Integer count) {
        this.count = count;
        return this;
    }
}
