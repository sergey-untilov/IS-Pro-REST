package ua.in.d6.domen.root;

public enum UserRole {
    ADMIN, USER;

    @Override
    public String toString() {
        return "ROLE_" + name();
    }
}