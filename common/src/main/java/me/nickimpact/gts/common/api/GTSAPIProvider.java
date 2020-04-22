package me.nickimpact.gts.common.api;

import co.aikar.commands.CommandIssuer;
import me.nickimpact.gts.api.GTSService;
import me.nickimpact.gts.api.enums.CommandResults;
import me.nickimpact.gts.api.holders.EntryRegistry;
import me.nickimpact.gts.api.listings.entries.Entry;
import me.nickimpact.gts.api.listings.ui.EntryUI;
import me.nickimpact.gts.api.placeholders.PlaceholderParser;
import me.nickimpact.gts.api.registry.GTSRegistry;
import me.nickimpact.gts.api.searching.Searcher;
import me.nickimpact.gts.api.services.ServiceManager;
import me.nickimpact.gts.api.storage.GTSStorage;
import me.nickimpact.gts.api.util.TriFunction;
import me.nickimpact.gts.common.registry.GTSRegisterImpl;
import me.nickimpact.gts.common.services.GTSServiceManager;

import java.util.List;
import java.util.Optional;

public class GTSAPIProvider implements GTSService {

	private ServiceManager serviceManager = new GTSServiceManager();
	private GTSRegistry registry = new GTSRegisterImpl();

	@Override
	public ServiceManager getServiceManager() {
		return this.serviceManager;
	}

	@Override
	public GTSRegistry getRegistry() {
		return this.registry;
	}

	@Override
	public GTSStorage getStorage() {
		return null;
	}

	@Override
	public EntryRegistry getEntryRegistry() {
		return null;
	}

	@Override
	public void registerEntry(List<String> identifier, Class<? extends Entry> entry, EntryUI ui, String rep, TriFunction<CommandIssuer, List<String>, Boolean, CommandResults> cmd) {

	}

	@Override
	public void addSearcher(String key, Searcher searcher) {

	}

	@Override
	public Optional<Searcher> getSearcher(String key) {
		return Optional.empty();
	}

	@Override
	public void registerPlaceholder(String token, PlaceholderParser parser) {

	}
}