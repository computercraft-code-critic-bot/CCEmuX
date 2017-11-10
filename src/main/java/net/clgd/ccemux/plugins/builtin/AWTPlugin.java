package net.clgd.ccemux.plugins.builtin;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import com.google.auto.service.AutoService;

import net.clgd.ccemux.emulation.EmuConfig;
import net.clgd.ccemux.plugins.Plugin;
import net.clgd.ccemux.rendering.RendererFactory;
import net.clgd.ccemux.rendering.awt.AWTRenderer;

@AutoService(Plugin.class)
public class AWTPlugin extends Plugin {
	@Override
	public String getName() {
		return "AWT Renderer";
	}

	@Override
	public String getDescription() {
		return "A CPU-based renderer using Java AWT.";
	}

	@Override
	public Optional<String> getVersion() {
		return Optional.empty();
	}

	@Override
	public Collection<String> getAuthors() {
		return Collections.singleton("CLGD");
	}

	@Override
	public Optional<String> getWebsite() {
		return Optional.empty();
	}

	@Override
	public void setup(EmuConfig cfg) {
		RendererFactory.implementations.put("AWT", AWTRenderer::new);
	}
}
