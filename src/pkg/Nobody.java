package pkg;

class Nobody implements Account {

	private static int PERM_LEVEL = 0;
  private String userName;
  private static byte[] passHash;
  private static byte[] passSalt;

  public Nobody() {

  }

  @Override
  public int getPermLevel() {
    return this.PERM_LEVEL;
  }

  @Override
  public String getUserName() {
    return this.userName;
  }

  @Override
  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public boolean checkHash() {
    return false;
  }
}
