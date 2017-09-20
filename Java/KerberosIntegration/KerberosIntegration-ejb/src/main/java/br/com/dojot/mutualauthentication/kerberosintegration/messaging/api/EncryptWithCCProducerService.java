package br.com.dojot.mutualauthentication.kerberosintegration.messaging.api;

import javax.ejb.Local;

import br.com.dojot.mutualauthentication.kerberosintegration.beans.dto.BatchCryptoWithCCDTO;

@Local
public interface EncryptWithCCProducerService {

	void produce(BatchCryptoWithCCDTO dto);
}
