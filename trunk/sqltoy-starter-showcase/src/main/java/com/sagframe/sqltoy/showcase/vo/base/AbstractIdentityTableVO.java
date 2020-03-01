/**
 *@Generated by sagacity-quickvo 4.6
 */
package com.sagframe.sqltoy.showcase.vo.base;

import java.io.Serializable;
import java.sql.Timestamp;

import org.sagacity.sqltoy.config.annotation.Column;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;


/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: SQLTOY_IDENTITY_TABLE,Remark:单主键验证表   
 */
@Entity(tableName="SQLTOY_IDENTITY_TABLE",pk_constraint="P_Key_1")
public abstract class AbstractIdentityTableVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //id,name,createTime
	 
	 //not null properties
	 //id,name,createTime

	/**
	 * 
	 */
	private static final long serialVersionUID = 8680900294395473929L;
	
	/**
	 * ID
	 */
	@Id(strategy="identity")
	@Column(name="ID",length=10L,type=java.sql.Types.INTEGER,nullable=false,autoIncrement=true)
	protected Integer id;
	
	/**
	 * 名字
	 */
	@Column(name="NAME",length=100L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String name;
	
	/**
	 * 创建时间
	 */
	@Column(name="CREATE_TIME",length=26L,type=java.sql.Types.TIMESTAMP,nullable=false)
	protected Timestamp createTime;
	


	/** default constructor */
	public AbstractIdentityTableVO() {
	}
	
	/** pk constructor */
	public AbstractIdentityTableVO(Integer id)
	{
		this.id=id;
	}


	/** full constructor */
	public AbstractIdentityTableVO(Integer id,String name,Timestamp createTime)
	{
		this.id=id;
		this.name=name;
		this.createTime=createTime;
	}
	
	/**
	 *@param id the id to set
	 */
	public void setId(Integer id) {
		this.id=id;
	}
		
	/**
	 *@return the Id
	 */
	public Integer getId() {
	    return this.id;
	}
	
	/**
	 *@param name the name to set
	 */
	public void setName(String name) {
		this.name=name;
	}
		
	/**
	 *@return the Name
	 */
	public String getName() {
	    return this.name;
	}
	
	/**
	 *@param createTime the createTime to set
	 */
	public void setCreateTime(Timestamp createTime) {
		this.createTime=createTime;
	}
		
	/**
	 *@return the CreateTime
	 */
	public Timestamp getCreateTime() {
	    return this.createTime;
	}



	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("id=").append(getId()).append("\n");
		columnsBuffer.append("name=").append(getName()).append("\n");
		columnsBuffer.append("createTime=").append(getCreateTime()).append("\n");
		return columnsBuffer.toString();
	}
}