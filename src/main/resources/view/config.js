import { GraphicEntityModule } from './entity-module/GraphicEntityModule.js';
import { EndScreenModule } from './modules/endScreen/EndScreenModule.js';
import { TooltipModule } from './modules/tooltip/TooltipModule.js';

// List of viewer modules that you want to use in your game
export const modules = [
	GraphicEntityModule,
	EndScreenModule,
	TooltipModule,
];
