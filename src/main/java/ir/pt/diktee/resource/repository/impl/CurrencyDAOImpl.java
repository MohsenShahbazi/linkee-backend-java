package ir.pt.diktee.resource.repository.impl;


import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.entity.adress.Country;
import ir.pt.diktee.resource.entity.adress.State;
import ir.pt.diktee.resource.entity.shop.Currency;
import ir.pt.diktee.resource.repository.CountryDAO;
import ir.pt.diktee.resource.repository.CurrencyDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CurrencyDAOImpl extends BaseDAOImpl<Currency> implements CurrencyDAO {


}
