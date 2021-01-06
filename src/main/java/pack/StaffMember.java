package pack;


public class StaffMember extends Client{

  public StaffMember() {
  }

  /**
   * create membership for pack.Client
   *
   * @param group
   */
  public void setMembership(String group) {
  }

  /**
   * remove memberships of Clients
   *
   * @param groupId
   */
  public void removeMembership(String groupId) {
  }

  /**
   * publish content from client
   *
   * @param contentId
   */
  public void publishContent(String contentId) {
  }

  /**
   * Create back up of user and send notification to all administrators
   *
   * @param userId
   */
  public void createBackUp(String userId) {

    sendNotificationToAllAdmins();
  }

  /**
   * Send notification to all administrations
   */
  private void sendNotificationToAllAdmins() {

  }

}
