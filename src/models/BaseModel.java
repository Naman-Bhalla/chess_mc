package models;

import java.util.Date;

public class BaseModel {
    private long id;
    private Date createdAt;
    private Date modifiedAt;
		public BaseModel() {
		}
		public BaseModel(long id) {
			this.id = id;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getModifiedAt() {
			return modifiedAt;
		}
		public void setModifiedAt(Date modifiedAt) {
			this.modifiedAt = modifiedAt;
		}
}
