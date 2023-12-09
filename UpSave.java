class UpSave implements BankAccountDecorator {
    private BankAccountDecorator account;

    public UpSave(BankAccountDecorator account) {
        this.account = account;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + ", With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    @Override
    public String showInfo() {
        return account.showInfo();
    }
}
