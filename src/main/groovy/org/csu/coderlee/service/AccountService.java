package org.csu.coderlee.service;

import org.csu.coderlee.model.Account;

public interface AccountService {
    Account selectById(Long id);
}
