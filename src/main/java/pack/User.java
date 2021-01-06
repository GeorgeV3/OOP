package pack;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class User {

  private int id;
  private String fullName;
  private Date dateOfBirth;
  private List<Group> group;
  private String status;
  private Instant lastLoginDate;
  private Authorization authorization;
  //keep the last login group
  private Group loginGroup;

  public Authorization getAuthorization() {
    return authorization;
  }

  public User() {
  }


  /**
   * Method where set the authorization permission role base on login role
   *
   * @param user
   */
  public void createUserRole(User user) {
    if (Objects.nonNull(user.getLoginGroup())) {
      if (Group.Administrator.equals(user.getLoginGroup())) {
        user.setAuthorization(new Administrator());
      }
      if (Group.StaffMember.equals(user.getLoginGroup())) {
        user.setAuthorization(new StaffMember());
      }
      if (Group.Client.equals(user.getLoginGroup())) {
        user.setAuthorization(new Client());
      }
    }
  }


  public void setId(int id) {
    this.id = id;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setGroup(List<Group> group) {
    this.group = group;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setLastLoginDate(Instant lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
  }

  public void setAuthorization(Authorization authorization) {
    this.authorization = authorization;
  }

  public void setLoginGroup(Group loginGroup) {
    this.loginGroup = loginGroup;
  }

  public int getId() {
    return id;
  }

  public String getFullName() {
    return fullName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public List<Group> getGroup() {
    return group;
  }

  public String getStatus() {
    return status;
  }

  public Instant getLastLoginDate() {
    return lastLoginDate;
  }

  public Group getLoginGroup() {
    return loginGroup;
  }


}
