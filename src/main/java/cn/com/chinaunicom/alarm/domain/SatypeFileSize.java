package cn.com.chinaunicom.alarm.domain;

import java.io.Serializable;

public class SatypeFileSize implements Serializable{
    private Integer id;
    private String prov_id;
    private String date_id;
    private String hour_id;
    private String minute_id;
    private String sa_type;
    private String size;

    public SatypeFileSize() {}

    public SatypeFileSize(Integer id, String prov_id, String date_id, String hour_id, String minute_id, String sa_type, String size) {
        this.id = id;
        this.prov_id = prov_id;
        this.date_id = date_id;
        this.hour_id = hour_id;
        this.minute_id = minute_id;
        this.sa_type = sa_type;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProv_id() {
        return prov_id;
    }

    public void setProv_id(String prov_id) {
        this.prov_id = prov_id;
    }

    public String getDate_id() {
        return date_id;
    }

    public void setDate_id(String date_id) {
        this.date_id = date_id;
    }

    public String getHour_id() {
        return hour_id;
    }

    public void setHour_id(String hour_id) {
        this.hour_id = hour_id;
    }

    public String getMinute_id() {
        return minute_id;
    }

    public void setMinute_id(String minute_id) {
        this.minute_id = minute_id;
    }

    public String getSa_type() {
        return sa_type;
    }

    public void setSa_type(String sa_type) {
        this.sa_type = sa_type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "SatypeFileSize{" +
                "id=" + id +
                ", prov_id='" + prov_id + '\'' +
                ", date_id='" + date_id + '\'' +
                ", hour_id='" + hour_id + '\'' +
                ", minute_id='" + minute_id + '\'' +
                ", sa_type='" + sa_type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
