package com.houoy.cms.vo;

        import java.util.List;

/**
 * @author andyzhao
 *         jquery datatables组件需要返回的数据格式定义
 */
public class JquryDataTablesVO<T> {

    /**
     * 前端发送的draw是多少，那么后端就返回多少
     * 这里建议把这个转换为整数后再返回，而不是直接返回，用来防止跨站脚本（xss）攻击
     */
    private int draw;
    /**
     * 数据库里总共记录数
     */
    private Long recordsTotal;
    /**
     * 过滤后的记录数
     */
    private Long recordsFiltered;
    /**
     * 数据
     */
    private List<T> data;
    /**
     * 错误信息
     */
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public Long getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(Long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Long getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(Long recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }
}
