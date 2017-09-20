package br.com.dojot.mutualauthentication.kerberosintegration.utils;

public interface KerberosIntegrationConstants {
	
	String COMPONENT_CRYPTO_INTEGRATION = "CryptoIntegration";
	String FUNCTION_CRYPTO = "crypto";
	String METHOD_REGISTER_CC = "registerCC";
	String METHOD_UNREGISTER_CC = "unregisterCC";
	String METHOD_ENCRYPT_WITH_CC = "encryptWithCC";
	String METHOD_DECRYPT_WITH_CC = "decryptWithCC";
	String METHOD_ENCRYPT = "encrypt";
	String METHOD_DECRYPT = "decrypt";
	
	String MICROSERVICE_COMPONENTS = "Components";
	String MICROSERVICE_COMPONENTS_FUNCTION_CONFIGURATION = "configuration";
	String MICROSERVICE_COMPONENTS_METHOD_SEARCH = "search";

	String TOPIC_REGISTER = "registertopic";
	String TOPIC_UNREGISTER = "unregistertopic";
	String TOPIC_DECRYPT = "decrypttopic";
	String TOPIC_ENCRYPT = "encrypttopic";
	String TOPIC_DECRYPT_WITH_CC = "decryptwithcctopic";
	String TOPIC_ENCRYPT_WITH_CC = "encryptwithcctopic";
	String TOPIC_SAVE_CRYPTO_CHANNEL = "savecryptochanneltopic";
	String TOPIC_LOGGING_PROCESSING = "logprocessingtopic";
	String TOPIC_KERBEROS_PROTOCOL = "kerberosprotocoltopic";
	String TOPIC_KERBEROS_MANAGEMENT = "kerberosmanagementtopic";
	String TOPIC_NUMBER_COMPONENTS = "componentsnumbertopic";
	
	String TIMEOUT_SAVE_CRYPTO_CHANNEL_SERVICE = "PARAM_KERBEROS_TIMEOUT_SAVE_CRYPTO_CHANNEL";
	String TIMEOUT_REGISTER_CRYPTO_CHANNEL_SERVICE = "PARAM_KERBEROS_TIMEOUT_CRYPTO_REGISTER_CHANNEL";
	String TIMEOUT_UNREGISTER_CRYPTO_CHANNEL_SERVICE = "PARAM_KERBEROS_TIMEOUT_CRYPTO_UNREGISTER_CHANNEL";
	String TIMEOUT_ENCRYPT_SERVICE = "PARAM_KERBEROS_TIMEOUT_CRYPTO_ENCRYPT";
	String TIMEOUT_ENCRYPT_CC_SERVICE = "PARAM_KERBEROS_TIMEOUT_CRYPTO_ENCRYPT_CC";
	String TIMEOUT_DECRYPT_SERVICE = "PARAM_KERBEROS_TIMEOUT_CRYPTO_DECRYPT";
	String TIMEOUT_DECRYPT_CC_SERVICE = "PARAM_KERBEROS_TIMEOUT_CRYPTO_DECRYPT_CC";
	String TIMEOUT_NUMBER_COMPONENTS_SERVICE = "PARAM_KERBEROS_TIMEOUT_NUMBER_COMPONENTS";
	
	String KERBEROS_WAIT_REQUEST_AS = "KERBEROS_WAIT_REQUEST_AS";
	String KERBEROS_PROCESS_REQUEST_AS = "KERBEROS_PROCESS_REQUEST_AS";
	String KERBEROS_WAIT_REQUEST_AP = "KERBEROS_WAIT_REQUEST_AP";
	String KERBEROS_PROCESS_REQUEST_AP = "KERBEROS_PROCESS_REQUEST_AP";
	String KERBEROS_COMPLETED = "KERBEROS_COMPLETED";
	String KERBEROS_NOT_COMPLETED = "KERBEROS_NOT_COMPLETED";
	
	String SERVER_NAME = "KERBEROS_SERVER_NAME";
	String SERVER_KEY = "KERBEROS_SERVER_KEY";
	
	long DEFAULT_EXPIRATION_INTERVAL = 600000;
	long TEST_EXPIRATION_INTERVAL = 24 * 60 * 60 * 1000;
	int KERBEROS_REQUEST_AS = 1;
	int KERBEROS_REQUEST_AP = 2;
	int KERBEROS_REGISTER_USER = 1;
	int KERBEROS_UNREGISTER_USER = 2;

	String REDIS_CLUSTER_MASTER_NAME = "redis-cs-cluster";
	
	String PARAM_KAFKA_BOOTSTRAP_SERVERS = "PARAM_KAFKA_BOOTSTRAP_SERVERS";
	String PARAM_KAFKA_NUMBER_OF_CONSUMERS = "PARAM_KAFKA_NUMBER_OF_CONSUMERS";
	String CONFIGURATION_PARAM_DEBUG_IS_ENABLED = "PARAM_DEBUG_IS_ENABLED";
	String DEBUG_ENABLED = "Y";
}
